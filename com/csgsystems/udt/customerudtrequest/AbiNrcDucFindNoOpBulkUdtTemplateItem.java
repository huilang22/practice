/*
 * Generated code DO NOT EDIT
 * Generated file: AbiNrcDucFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AbiNrcDucFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AbiNrcDucFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AbiNrcDucObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AbiNrcDucFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AbiNrcDucFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiNrcDucObjectDataList noOpInIn) {
    super(id, context, "AbiNrcDucFind");
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
        mapArray[i] = AbiNrcDucObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AbiNrcDuc", noOpIn);
      }
      addInput("AbiNrcDuc", mapList);
    }
  }
/**
 *
 * Sets the  AbiNrcDuc
 * @param noOpInIn AbiNrcDucObjectDataList to set
 *
 */
  public void setAbiNrcDuc(AbiNrcDucObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AbiNrcDuc passed into the constructor
 * @return Simulated response
 *
 */
  public AbiNrcDucObjectDataList getAbiNrcDuc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AbiNrcDucObjectHelper.fromMapList(inputMap, "AbiNrcDucList");
  }
}
