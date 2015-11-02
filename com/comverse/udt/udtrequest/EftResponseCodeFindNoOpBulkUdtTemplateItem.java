/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftResponseCodeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EftResponseCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EftResponseCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EftResponseCodeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   EftResponseCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EftResponseCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EftResponseCodeObjectDataList noOpInIn) {
    super(id, context, "EftResponseCodeFind");
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
        mapArray[i] = EftResponseCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EftResponseCode", noOpIn);
      }
      addInput("EftResponseCode", mapList);
    }
  }
/**
 *
 * Sets the  EftResponseCode
 * @param noOpInIn EftResponseCodeObjectDataList to set
 *
 */
  public void setEftResponseCode(EftResponseCodeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EftResponseCode passed into the constructor
 * @return Simulated response
 *
 */
  public EftResponseCodeObjectDataList getEftResponseCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EftResponseCodeObjectHelper.fromMapList(inputMap, "EftResponseCodeList");
  }
}
