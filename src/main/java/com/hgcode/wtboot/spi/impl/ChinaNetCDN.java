package com.hgcode.wtboot.spi.impl;

import com.hgcode.wtboot.spi.UploadCDN;

public class ChinaNetCDN implements UploadCDN {

  @Override
  public void upload(String url) {
    System.out.println("ChinaNet");
  }
}
