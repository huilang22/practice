/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobtypeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsJobtypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsJobtypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsJobtypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsJobtypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsJobtypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobtypeObjectDataList noOpInIn) {
    super(id, context, "InvsJobtypeFind");
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
        mapArray[i] = InvsJobtypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsJobtype", noOpIn);
      }
      addInput("InvsJobtype", mapList);
    }
  }
/**
 *
 * Sets the  InvsJobtype
 * @param noOpInIn InvsJobtypeObjectDataList to set
 *
 */
  public void setInvsJobtype(InvsJobtypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsJobtype passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobtypeObjectDataList getInvsJobtype() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsJobtypeObjectHelper.fromMapList(inputMap, "InvsJobtypeList");
  }
}
