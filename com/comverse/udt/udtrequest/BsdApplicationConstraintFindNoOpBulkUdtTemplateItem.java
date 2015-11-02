/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationConstraintFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdApplicationConstraintFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationConstraintFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationConstraintObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationConstraintFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationConstraintFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationConstraintObjectDataList noOpInIn) {
    super(id, context, "BsdApplicationConstraintFind");
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
        mapArray[i] = BsdApplicationConstraintObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdApplicationConstraint", noOpIn);
      }
      addInput("BsdApplicationConstraint", mapList);
    }
  }
/**
 *
 * Sets the  BsdApplicationConstraint
 * @param noOpInIn BsdApplicationConstraintObjectDataList to set
 *
 */
  public void setBsdApplicationConstraint(BsdApplicationConstraintObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplicationConstraint passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationConstraintObjectDataList getBsdApplicationConstraint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationConstraintObjectHelper.fromMapList(inputMap, "BsdApplicationConstraintList");
  }
}
