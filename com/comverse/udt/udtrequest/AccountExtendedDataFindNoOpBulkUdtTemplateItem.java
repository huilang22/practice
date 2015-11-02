/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountExtendedDataFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountExtendedDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountExtendedDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountEDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountExtendedDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountExtendedDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountEDObjectDataList noOpInIn) {
    super(id, context, "AccountExtendedDataFind");
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
        mapArray[i] = AccountEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountExtendedData", noOpIn);
      }
      addInput("AccountExtendedData", mapList);
    }
  }
/**
 *
 * Sets the  AccountExtendedData
 * @param noOpInIn AccountEDObjectDataList to set
 *
 */
  public void setAccountExtendedData(AccountEDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountEDObjectDataList getAccountExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountEDObjectHelper.fromMapList(inputMap, "AccountExtendedDataList");
  }
}
