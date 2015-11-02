/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CsrFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CsrFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CsrObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CsrFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CsrFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrObjectDataList noOpInIn) {
    super(id, context, "CsrFind");
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
        mapArray[i] = CsrObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Csr", noOpIn);
      }
      addInput("Csr", mapList);
    }
  }
/**
 *
 * Sets the  Csr
 * @param noOpInIn CsrObjectDataList to set
 *
 */
  public void setCsr(CsrObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Csr passed into the constructor
 * @return Simulated response
 *
 */
  public CsrObjectDataList getCsr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CsrObjectHelper.fromMapList(inputMap, "CsrList");
  }
}
