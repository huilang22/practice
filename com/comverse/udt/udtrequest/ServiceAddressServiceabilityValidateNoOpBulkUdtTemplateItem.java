/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressServiceabilityValidateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ServiceAddressServiceabilityValidateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceAddressServiceabilityValidateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SvcAddrObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceAddressServiceabilityValidateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceAddressServiceabilityValidateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SvcAddrObjectDataList noOpInIn) {
    super(id, context, "ServiceAddressServiceabilityValidate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = SvcAddrObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SvcAddrServiceability", noOpIn);
      }
      addInput("SvcAddrServiceability", mapList);
    }
  }
/**
 *
 * Sets the  SvcAddrServiceability
 * @param noOpInIn SvcAddrObjectDataList to set
 *
 */
  public void setSvcAddrServiceability(SvcAddrObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SvcAddrServiceability passed into the constructor
 * @return Simulated response
 *
 */
  public SvcAddrObjectDataList getSvcAddrServiceability() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SvcAddrObjectHelper.fromMapList(inputMap, "SvcAddrServiceabilityList");
  }
}
