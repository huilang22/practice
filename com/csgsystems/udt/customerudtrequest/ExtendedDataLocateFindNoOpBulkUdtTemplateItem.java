/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataLocateFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExtendedDataLocateFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExtendedDataLocateFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExtendedDataLocateObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ExtendedDataLocateFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExtendedDataLocateFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExtendedDataLocateObjectDataList noOpInIn) {
    super(id, context, "ExtendedDataLocateFind");
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
        mapArray[i] = ExtendedDataLocateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExtendedDataLocate", noOpIn);
      }
      addInput("ExtendedDataLocate", mapList);
    }
  }
/**
 *
 * Sets the  ExtendedDataLocate
 * @param noOpInIn ExtendedDataLocateObjectDataList to set
 *
 */
  public void setExtendedDataLocate(ExtendedDataLocateObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExtendedDataLocate passed into the constructor
 * @return Simulated response
 *
 */
  public ExtendedDataLocateObjectDataList getExtendedDataLocate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExtendedDataLocateObjectHelper.fromMapList(inputMap, "ExtendedDataLocateList");
  }
}
