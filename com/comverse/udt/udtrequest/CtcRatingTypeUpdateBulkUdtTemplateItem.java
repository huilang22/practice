/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingTypeUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcRatingTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingTypeObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcRatingTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingTypeObjectData UpdateInIn) {
    super(id, context, "CtcRatingTypeUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcRatingType", CtcRatingTypeObjectHelper.toMap(UpdateIn, new HashMap(), "CtcRatingType").get("CtcRatingType"));
    }
  }


/**
 *
 * Sets the CtcRatingType
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcRatingType(CtcRatingTypeObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcRatingTypeObjectHelper.fromMap(inputMap, "CtcRatingType");
  }

/**
 *
 * Gets the CtcRatingType
 * @return Value of the CtcRatingType
 *
 */

  public CtcRatingTypeObjectData getCtcRatingType( ) {
    return UpdateIn;
  }

}
