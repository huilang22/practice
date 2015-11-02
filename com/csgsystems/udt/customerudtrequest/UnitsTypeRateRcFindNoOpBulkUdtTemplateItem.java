/*
 * Generated code DO NOT EDIT
 * Generated file: UnitsTypeRateRcFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a UnitsTypeRateRcFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitsTypeRateRcFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitsTypeRcObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UnitsTypeRateRcFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitsTypeRateRcFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitsTypeRcObjectDataList noOpInIn) {
    super(id, context, "UnitsTypeRateRcFind");
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
        mapArray[i] = UnitsTypeRcObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UnitsType", noOpIn);
      }
      addInput("UnitsType", mapList);
    }
  }
/**
 *
 * Sets the  UnitsType
 * @param noOpInIn UnitsTypeRcObjectDataList to set
 *
 */
  public void setUnitsType(UnitsTypeRcObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnitsType passed into the constructor
 * @return Simulated response
 *
 */
  public UnitsTypeRcObjectDataList getUnitsType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnitsTypeRcObjectHelper.fromMapList(inputMap, "UnitsTypeList");
  }
}
