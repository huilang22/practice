/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RegulatoryIdFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a RegulatoryIdFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RegulatoryIdFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RegulatoryIdObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RegulatoryIdFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RegulatoryIdFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RegulatoryIdObjectDataList noOpInIn) {
    super(id, context, "RegulatoryIdFind");
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
        mapArray[i] = RegulatoryIdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RegulatoryId", noOpIn);
      }
      addInput("RegulatoryId", mapList);
    }
  }
/**
 *
 * Sets the  RegulatoryId
 * @param noOpInIn RegulatoryIdObjectDataList to set
 *
 */
  public void setRegulatoryId(RegulatoryIdObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RegulatoryId passed into the constructor
 * @return Simulated response
 *
 */
  public RegulatoryIdObjectDataList getRegulatoryId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RegulatoryIdObjectHelper.fromMapList(inputMap, "RegulatoryIdList");
  }
}
