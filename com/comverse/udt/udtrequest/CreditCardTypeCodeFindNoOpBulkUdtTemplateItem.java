/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardTypeCodeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CreditCardTypeCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CreditCardTypeCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CreditCardTypeCodeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CreditCardTypeCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CreditCardTypeCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CreditCardTypeCodeObjectDataList noOpInIn) {
    super(id, context, "CreditCardTypeCodeFind");
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
        mapArray[i] = CreditCardTypeCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CreditCardTypeCode", noOpIn);
      }
      addInput("CreditCardTypeCode", mapList);
    }
  }
/**
 *
 * Sets the  CreditCardTypeCode
 * @param noOpInIn CreditCardTypeCodeObjectDataList to set
 *
 */
  public void setCreditCardTypeCode(CreditCardTypeCodeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CreditCardTypeCode passed into the constructor
 * @return Simulated response
 *
 */
  public CreditCardTypeCodeObjectDataList getCreditCardTypeCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CreditCardTypeCodeObjectHelper.fromMapList(inputMap, "CreditCardTypeCodeList");
  }
}
