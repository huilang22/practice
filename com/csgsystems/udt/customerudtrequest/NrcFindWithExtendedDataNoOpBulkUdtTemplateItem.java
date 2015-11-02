/*
 * Generated code DO NOT EDIT
 * Generated file: NrcFindWithExtendedDataNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a NrcFindWithExtendedDataNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcFindWithExtendedDataNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NrcFindWithExtendedDataNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcFindWithExtendedDataNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectDataList noOpInIn) {
    super(id, context, "NrcFindWithExtendedData");
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
        mapArray[i] = NrcObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Nrc", noOpIn);
      }
      addInput("Nrc", mapList);
    }
  }
/**
 *
 * Sets the  Nrc
 * @param noOpInIn NrcObjectDataList to set
 *
 */
  public void setNrc(NrcObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Nrc passed into the constructor
 * @return Simulated response
 *
 */
  public NrcObjectDataList getNrc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcObjectHelper.fromMapList(inputMap, "NrcList");
  }
}
