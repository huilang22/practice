/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationInvAssocFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLocationInvAssocFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationInvAssocFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationInvAssocObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsLocationInvAssocFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationInvAssocFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationInvAssocObjectDataList noOpInIn) {
    super(id, context, "InvsLocationInvAssocFind");
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
        mapArray[i] = InvsLocationInvAssocObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLocationInvAssoc", noOpIn);
      }
      addInput("InvsLocationInvAssoc", mapList);
    }
  }
/**
 *
 * Sets the  InvsLocationInvAssoc
 * @param noOpInIn InvsLocationInvAssocObjectDataList to set
 *
 */
  public void setInvsLocationInvAssoc(InvsLocationInvAssocObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocationInvAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationInvAssocObjectDataList getInvsLocationInvAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationInvAssocObjectHelper.fromMapList(inputMap, "InvsLocationInvAssocList");
  }
}
