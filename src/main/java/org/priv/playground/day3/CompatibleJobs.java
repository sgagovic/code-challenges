package org.priv.playground.day3;

import java.util.List;

/*
You are given a list of jobs to be done, where each job is represented by a start time and end time. Two jobs are compatible if they don't overlap. Find the largest subset of compatible jobs.

For example, given the following jobs (there is no guarantee that jobs will be sorted):

[(0, 6),
(1, 4),
(3, 5),
(3, 8),
(4, 7),
(5, 9),
(6, 10),
(8, 11)]
Return:

[(1, 4),
(4, 7),
(8, 11)]
 */
public class CompatibleJobs {

    //first job starts at 0 and that means that is not compatible with neither one of the jobs since neither one can start duringit
    //take second job from 1-4, next job that can start is from 4-7 and and the first one that can start after is from 8-11

    public List<Pair> findCompatibleJobs(List<Pair> jobs){
        return null;
    }
}
