/*
 * Generated code DO NOT EDIT
 * Generated file: UnitsTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UnitsTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitsTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitsTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UnitsTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitsTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitsTypeObjectDataList noOpInIn) {
    super(id, context, "UnitsTypeFind");
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
        mapArray[i] = UnitsTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UnitsType", noOpIn);
      }
      addInput("UnitsType", mapList);
    }
  }
/**
 *
 * Sets the  UnitsType
 * @param noOpInIn UnitsTypeObjectDataList to set
 *
 */
  public void setUnitsType(UnitsTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnitsType passed into the constructor
 * @return Simulated response
 *
 */
  public UnitsTypeObjectDataList getUnitsType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnitsTypeObjectHelper.fromMapList(inputMap, "UnitsTypeList");
  }
}
