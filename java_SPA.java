// java single file

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class java_SPA {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m-1;
        int len2 = n-1;
        int len = m+n-1;
        while(len1 >= 0 && len2 >=0) {
            //
            nums1[len--] = nums1[len1] > nums2[len2] ? nums1[len1--]:nums2[len2--]; 
        }
        System.arraycopy(nums2,0,nums1,0,len2 +1);
    }

public void getMost(String str){
        char[] max = new char[str.length()];
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            int count = str.length()-str.replace(String.valueOf(c),"").length();
            max[count]=c;
        }
        // find the max index of value in max[]
        int maxIndex = 0;
    }
public static void main(String[] args) {
		// 获取 Java 线程管理 MXBean
	ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		// 不需要获取同步的 monitor 和 synchronizer 信息，仅获取线程和线程堆栈信息
		ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
		// 遍历线程信息，仅打印线程 ID 和线程名称信息
		for (ThreadInfo threadInfo : threadInfos) {
			System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.getThreadName());
		}
	}
}
