/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesDeleteBulkUdtTemplateItem.java
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
 * Class used to create a LateFeeRateOverridesDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class LateFeeRateOverridesDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LateFeeRateOverridesObjectKeyData LFROdIn;
  protected Date LFROCeaseDate;
/**
 *
 * Constructor to create a  LateFeeRateOverridesDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LateFeeRateOverridesDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, LateFeeRateOverridesObjectKeyData LFROdInIn, Date LFROCeaseDateIn) {
    super(id, context, "LateFeeRateOverridesDelete");
    LFROdIn = LFROdInIn;
    LFROCeaseDate = LFROCeaseDateIn;
  }

  public void translateToMap() {
    if (LFROdIn != null) {
      LFROdIn.resetFlags(true, true);
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectKeyHelper.toMap(LFROdIn, new HashMap(), "LateFeeRateOverridesObjectKeyData").get("LateFeeRateOverridesObjectKeyData"));
    }
    if (LFROCeaseDate != null) {
      addInput("LFROCeaseDate", LFROCeaseDate);
    }
  }


/**
 *
 * Sets the LateFeeRateOverrides
 * @param LFROdInIn Value of the LFROdIn
 *
 */

  public void setLateFeeRateOverrides(LateFeeRateOverridesObjectKeyData LFROdInIn) {
    LFROdIn = LFROdInIn;
  }

/**
 *
 * Sets the LFROCeaseDate
 * @param LFROCeaseDateIn Value of the LFROCeaseDate
 *
 */

  public void setLFROCeaseDate(Date LFROCeaseDateIn) {
    LFROCeaseDate = LFROCeaseDateIn;
  }

  public void translateFromMap() {
    LFROdIn = LateFeeRateOverridesObjectKeyHelper.fromMap(inputMap, "LateFeeRateOverrides");
    LFROCeaseDate = (Date)inputMap.get("LFROCeaseDate");
  }

/**
 *
 * Gets the LateFeeRateOverrides
 * @return Value of the LateFeeRateOverrides
 *
 */

  public LateFeeRateOverridesObjectKeyData getLateFeeRateOverrides( ) {
    return LFROdIn;
  }

/**
 *
 * Gets the LFROCeaseDate
 * @return Value of the LFROCeaseDate
 *
 */

  public Date getLFROCeaseDate( ) {
    return LFROCeaseDate;
  }

}
