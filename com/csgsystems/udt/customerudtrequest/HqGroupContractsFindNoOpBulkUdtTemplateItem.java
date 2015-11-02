/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupContractsFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a HqGroupContractsFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupContractsFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupContractsObjectDataList noOpIn;

/**
 *
 * Constructor to create a   HqGroupContractsFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupContractsFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupContractsObjectDataList noOpInIn) {
    super(id, context, "HqGroupContractsFind");
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
        mapArray[i] = HqGroupContractsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqGroupContracts", noOpIn);
      }
      addInput("HqGroupContracts", mapList);
    }
  }
/**
 *
 * Sets the  HqGroupContracts
 * @param noOpInIn HqGroupContractsObjectDataList to set
 *
 */
  public void setHqGroupContracts(HqGroupContractsObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroupContracts passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupContractsObjectDataList getHqGroupContracts() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupContractsObjectHelper.fromMapList(inputMap, "HqGroupContractsList");
  }
}
