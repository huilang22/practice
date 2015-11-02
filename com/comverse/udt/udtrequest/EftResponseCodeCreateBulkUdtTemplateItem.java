/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftResponseCodeCreateBulkUdtTemplateItem.java
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
 * Class used to create a EftResponseCodeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class EftResponseCodeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EftResponseCodeObjectData ERCCreateIn;
/**
 *
 * Constructor to create a  EftResponseCodeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EftResponseCodeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, EftResponseCodeObjectData ERCCreateInIn) {
    super(id, context, "EftResponseCodeCreate");
    ERCCreateIn = ERCCreateInIn;
  }

  public void translateToMap() {
    if (ERCCreateIn != null) {
      ERCCreateIn.resetFlags(true, true);
      addInput("EftResponseCode", EftResponseCodeObjectHelper.toMap(ERCCreateIn, new HashMap(), "EftResponseCode").get("EftResponseCode"));
    }
  }


/**
 *
 * Sets the EftResponseCode
 * @param ERCCreateInIn Value of the ERCCreateIn
 *
 */

  public void setEftResponseCode(EftResponseCodeObjectData ERCCreateInIn) {
    ERCCreateIn = ERCCreateInIn;
  }

  public void translateFromMap() {
    ERCCreateIn = EftResponseCodeObjectHelper.fromMap(inputMap, "EftResponseCode");
  }

/**
 *
 * Gets the EftResponseCode
 * @return Value of the EftResponseCode
 *
 */

  public EftResponseCodeObjectData getEftResponseCode( ) {
    return ERCCreateIn;
  }

}
