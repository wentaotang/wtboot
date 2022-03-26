package com.hgcode.wtboot;


import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.google.common.base.Splitter;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import java.io.*;

class WtbootApplicationTests {

  /**
   * 冒泡排序
   */
  @Test
  void maopaoSort() {

    int[] array = new int[]{6,3,5,66,2,9,12};

    int len = array.length;

    for (int i =0;i<len-1;i++) {
      for(int j=0;j<len-i-1;j++){
        if(array[j] > array[j+1]){
           int temp = array[j];
           array[j] = array[j+1];
           array[j+1] = temp;
        }
      }
    }

    for(int i : array){
      System.out.println(i);
    }
  }

  private void swap(int i,int j){
     int temp =i;
     j = i;
     i =
  }
}
