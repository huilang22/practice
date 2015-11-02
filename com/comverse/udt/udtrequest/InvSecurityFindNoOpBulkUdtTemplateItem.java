/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSecurityFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvSecurityFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvSecurityFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvSecurityObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvSecurityFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvSecurityFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSecurityObjectDataList noOpInIn) {
    super(id, context, "InvSecurityFind");
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
        mapArray[i] = InvSecurityObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvSecurity", noOpIn);
      }
      addInput("InvSecurity", mapList);
    }
  }
/**
 *
 * Sets the  InvSecurity
 * @param noOpInIn InvSecurityObjectDataList to set
 *
 */
  public void setInvSecurity(InvSecurityObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvSecurity passed into the constructor
 * @return Simulated response
 *
 */
  public InvSecurityObjectDataList getInvSecurity() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvSecurityObjectHelper.fromMapList(inputMap, "InvSecurityList");
  }
}
