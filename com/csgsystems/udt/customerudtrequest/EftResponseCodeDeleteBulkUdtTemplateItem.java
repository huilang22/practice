/*
 * Generated code DO NOT EDIT
 * Generated file: EftResponseCodeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a EftResponseCodeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class EftResponseCodeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EftResponseCodeObjectKeyData ERCDeleteIn;
/**
 *
 * Constructor to create a  EftResponseCodeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EftResponseCodeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, EftResponseCodeObjectKeyData ERCDeleteInIn) {
    super(id, context, "EftResponseCodeDelete");
    ERCDeleteIn = ERCDeleteInIn;
  }

  public void translateToMap() {
    if (ERCDeleteIn != null) {
      ERCDeleteIn.resetFlags(true, true);
      addInput("EftResponseCode", EftResponseCodeObjectKeyHelper.toMap(ERCDeleteIn, new HashMap(), "EftResponseCodeObjectKeyData").get("EftResponseCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the EftResponseCode
 * @param ERCDeleteInIn Value of the ERCDeleteIn
 *
 */

  public void setEftResponseCode(EftResponseCodeObjectKeyData ERCDeleteInIn) {
    ERCDeleteIn = ERCDeleteInIn;
  }

  public void translateFromMap() {
    ERCDeleteIn = EftResponseCodeObjectKeyHelper.fromMap(inputMap, "EftResponseCode");
  }

/**
 *
 * Gets the EftResponseCode
 * @return Value of the EftResponseCode
 *
 */

  public EftResponseCodeObjectKeyData getEftResponseCode( ) {
    return ERCDeleteIn;
  }

}
