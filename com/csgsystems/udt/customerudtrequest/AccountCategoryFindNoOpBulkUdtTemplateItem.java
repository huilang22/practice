/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCategoryFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a AccountCategoryFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountCategoryFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ACObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountCategoryFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountCategoryFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ACObjectDataList noOpInIn) {
    super(id, context, "AccountCategoryFind");
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
        mapArray[i] = ACObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountCategory", noOpIn);
      }
      addInput("AccountCategory", mapList);
    }
  }
/**
 *
 * Sets the  AccountCategory
 * @param noOpInIn ACObjectDataList to set
 *
 */
  public void setAccountCategory(ACObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountCategory passed into the constructor
 * @return Simulated response
 *
 */
  public ACObjectDataList getAccountCategory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ACObjectHelper.fromMapList(inputMap, "AccountCategoryList");
  }
}
