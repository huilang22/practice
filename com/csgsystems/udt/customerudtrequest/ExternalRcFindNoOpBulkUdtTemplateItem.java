/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalRcFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ExternalRcFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExternalRcFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExternalRcObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ExternalRcFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExternalRcFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExternalRcObjectDataList noOpInIn) {
    super(id, context, "ExternalRcFind");
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
        mapArray[i] = ExternalRcObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExternalRc", noOpIn);
      }
      addInput("ExternalRc", mapList);
    }
  }
/**
 *
 * Sets the  ExternalRc
 * @param noOpInIn ExternalRcObjectDataList to set
 *
 */
  public void setExternalRc(ExternalRcObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExternalRc passed into the constructor
 * @return Simulated response
 *
 */
  public ExternalRcObjectDataList getExternalRc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExternalRcObjectHelper.fromMapList(inputMap, "ExternalRcList");
  }
}
