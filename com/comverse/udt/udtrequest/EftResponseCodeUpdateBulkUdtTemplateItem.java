/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftResponseCodeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a EftResponseCodeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class EftResponseCodeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EftResponseCodeObjectData ERCUpdateIn;
/**
 *
 * Constructor to create a  EftResponseCodeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EftResponseCodeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, EftResponseCodeObjectData ERCUpdateInIn) {
    super(id, context, "EftResponseCodeUpdate");
    ERCUpdateIn = ERCUpdateInIn;
  }

  public void translateToMap() {
    if (ERCUpdateIn != null) {
      ERCUpdateIn.resetFlags(true, true);
      addInput("EftResponseCode", EftResponseCodeObjectHelper.toMap(ERCUpdateIn, new HashMap(), "EftResponseCode").get("EftResponseCode"));
    }
  }


/**
 *
 * Sets the EftResponseCode
 * @param ERCUpdateInIn Value of the ERCUpdateIn
 *
 */

  public void setEftResponseCode(EftResponseCodeObjectData ERCUpdateInIn) {
    ERCUpdateIn = ERCUpdateInIn;
  }

  public void translateFromMap() {
    ERCUpdateIn = EftResponseCodeObjectHelper.fromMap(inputMap, "EftResponseCode");
  }

/**
 *
 * Gets the EftResponseCode
 * @return Value of the EftResponseCode
 *
 */

  public EftResponseCodeObjectData getEftResponseCode( ) {
    return ERCUpdateIn;
  }

}
