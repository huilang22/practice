/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDistribPercentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ChargeDistribPercentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ChargeDistribPercentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ChargeDistribPercentObjectData CDPupdate_In;
/**
 *
 * Constructor to create a  ChargeDistribPercentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ChargeDistribPercentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ChargeDistribPercentObjectData CDPupdate_InIn) {
    super(id, context, "ChargeDistribPercentUpdate");
    CDPupdate_In = CDPupdate_InIn;
  }

  public void translateToMap() {
    if (CDPupdate_In != null) {
      CDPupdate_In.resetFlags(true, true);
      addInput("ChargeDistribPercent", ChargeDistribPercentObjectHelper.toMap(CDPupdate_In, new HashMap(), "ChargeDistribPercent").get("ChargeDistribPercent"));
    }
  }


/**
 *
 * Sets the ChargeDistribPercent
 * @param CDPupdate_InIn Value of the CDPupdate_In
 *
 */

  public void setChargeDistribPercent(ChargeDistribPercentObjectData CDPupdate_InIn) {
    CDPupdate_In = CDPupdate_InIn;
  }

  public void translateFromMap() {
    CDPupdate_In = ChargeDistribPercentObjectHelper.fromMap(inputMap, "ChargeDistribPercent");
  }

/**
 *
 * Gets the ChargeDistribPercent
 * @return Value of the ChargeDistribPercent
 *
 */

  public ChargeDistribPercentObjectData getChargeDistribPercent( ) {
    return CDPupdate_In;
  }

}
