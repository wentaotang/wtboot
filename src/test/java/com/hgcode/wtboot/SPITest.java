package com.hgcode.wtboot;

import com.hgcode.wtboot.spi.UploadCDN;
import java.util.ServiceLoader;
import org.junit.jupiter.api.Test;

public class SPITest {

  @Test
  public void test(){
    ServiceLoader<UploadCDN> serviceLoader = ServiceLoader.load(UploadCDN.class);

    for(UploadCDN uploadCDN : serviceLoader){
      uploadCDN.upload("abc");
    }
  }
}
