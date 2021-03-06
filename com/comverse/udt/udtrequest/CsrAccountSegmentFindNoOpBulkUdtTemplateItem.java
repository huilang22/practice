/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrAccountSegmentFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CsrAccountSegmentFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CsrAccountSegmentFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CsrAccountSegmentObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CsrAccountSegmentFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CsrAccountSegmentFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrAccountSegmentObjectDataList noOpInIn) {
    super(id, context, "CsrAccountSegmentFind");
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
        mapArray[i] = CsrAccountSegmentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CsrAccountSegment", noOpIn);
      }
      addInput("CsrAccountSegment", mapList);
    }
  }
/**
 *
 * Sets the  CsrAccountSegment
 * @param noOpInIn CsrAccountSegmentObjectDataList to set
 *
 */
  public void setCsrAccountSegment(CsrAccountSegmentObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CsrAccountSegment passed into the constructor
 * @return Simulated response
 *
 */
  public CsrAccountSegmentObjectDataList getCsrAccountSegment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CsrAccountSegmentObjectHelper.fromMapList(inputMap, "CsrAccountSegmentList");
  }
}
