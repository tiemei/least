package com.tiemei.demo.least.spring;

import com.taobao.pamirs.schedule.IScheduleTaskDealSingle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author tiemei
 * @since 2016-09-12
 */
public class TbsTask implements IScheduleTaskDealSingle<Task> {

    private AtomicInteger ai = new AtomicInteger();

    @Override
    public List<Task> selectTasks(String taskParameter, String ownSign, int taskItemNum, List taskItemList, int eachFetchDataNum) throws Exception {
        List<Task> rst = new ArrayList<Task>();
        rst.add(new Task(ai.getAndAdd(1)));
        rst.add(new Task(ai.getAndAdd(1)));
        return rst;
    }

    @Override
    public Comparator<Task> getComparator() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getId() - o2.getId();
            }
        };
    }

    @Override
    public boolean execute(Task task, String ownSign) throws Exception {
        System.err.println("execute task:" + task.getId());
        Thread.sleep(2000);
        return true;
    }
}
