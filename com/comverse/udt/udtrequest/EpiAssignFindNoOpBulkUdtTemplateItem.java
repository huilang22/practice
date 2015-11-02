/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiAssignFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a EpiAssignFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EpiAssignFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EpiAssignObjectDataList noOpIn;

/**
 *
 * Constructor to create a   EpiAssignFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EpiAssignFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EpiAssignObjectDataList noOpInIn) {
    super(id, context, "EpiAssignFind");
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
        mapArray[i] = EpiAssignObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EpiAssign", noOpIn);
      }
      addInput("EpiAssign", mapList);
    }
  }
/**
 *
 * Sets the  EpiAssign
 * @param noOpInIn EpiAssignObjectDataList to set
 *
 */
  public void setEpiAssign(EpiAssignObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EpiAssign passed into the constructor
 * @return Simulated response
 *
 */
  public EpiAssignObjectDataList getEpiAssign() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EpiAssignObjectHelper.fromMapList(inputMap, "EpiAssignList");
  }
}
