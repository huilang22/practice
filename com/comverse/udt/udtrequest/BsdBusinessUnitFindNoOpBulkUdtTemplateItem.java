/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdBusinessUnitFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdBusinessUnitFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdBusinessUnitFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdBusinessUnitObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdBusinessUnitFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdBusinessUnitFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdBusinessUnitObjectDataList noOpInIn) {
    super(id, context, "BsdBusinessUnitFind");
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
        mapArray[i] = BsdBusinessUnitObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdBusinessUnit", noOpIn);
      }
      addInput("BsdBusinessUnit", mapList);
    }
  }
/**
 *
 * Sets the  BsdBusinessUnit
 * @param noOpInIn BsdBusinessUnitObjectDataList to set
 *
 */
  public void setBsdBusinessUnit(BsdBusinessUnitObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdBusinessUnit passed into the constructor
 * @return Simulated response
 *
 */
  public BsdBusinessUnitObjectDataList getBsdBusinessUnit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdBusinessUnitObjectHelper.fromMapList(inputMap, "BsdBusinessUnitList");
  }
}
