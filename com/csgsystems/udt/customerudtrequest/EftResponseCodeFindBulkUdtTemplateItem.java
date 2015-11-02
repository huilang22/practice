/*
 * Generated code DO NOT EDIT
 * Generated file: EftResponseCodeFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a EftResponseCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EftResponseCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EftResponseCodeObjectFilter ERCFindIn;
/**
 *
 * Constructor to create a  EftResponseCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EftResponseCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, EftResponseCodeObjectFilter ERCFindInIn) {
    super(id, context, "EftResponseCodeFind");
    ERCFindIn = ERCFindInIn;
  }

  public void translateToMap() {
    if (ERCFindIn != null) {
      Integer index =  ERCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EftResponseCode", EftResponseCodeObjectHelper.toMap(ERCFindIn, new HashMap(), "EftResponseCode").get("EftResponseCode"));
    }
  }


/**
 *
 * Sets the EftResponseCode
 * @param ERCFindInIn Value of the ERCFindIn
 *
 */

  public void setEftResponseCode(EftResponseCodeObjectFilter ERCFindInIn) {
    ERCFindIn = ERCFindInIn;
  }

  public void translateFromMap() {
    ERCFindIn = EftResponseCodeObjectHelper.fromMapFilter(inputMap, "EftResponseCode");
  }

/**
 *
 * Gets the EftResponseCode
 * @return Value of the EftResponseCode
 *
 */

  public EftResponseCodeObjectFilter getEftResponseCode( ) {
    return ERCFindIn;
  }

}
