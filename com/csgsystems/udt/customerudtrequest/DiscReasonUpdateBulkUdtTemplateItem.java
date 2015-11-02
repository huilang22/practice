/*
 * Generated code DO NOT EDIT
 * Generated file: DiscReasonUpdateBulkUdtTemplateItem.java
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
 * Class used to create a DiscReasonUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscReasonUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DiscReasonObjectData DRUpdateIn;
/**
 *
 * Constructor to create a  DiscReasonUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscReasonUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, DiscReasonObjectData DRUpdateInIn) {
    super(id, context, "DiscReasonUpdate");
    DRUpdateIn = DRUpdateInIn;
  }

  public void translateToMap() {
    if (DRUpdateIn != null) {
      DRUpdateIn.resetFlags(true, true);
      addInput("DiscReason", DiscReasonObjectHelper.toMap(DRUpdateIn, new HashMap(), "DiscReason").get("DiscReason"));
    }
  }


/**
 *
 * Sets the DiscReason
 * @param DRUpdateInIn Value of the DRUpdateIn
 *
 */

  public void setDiscReason(DiscReasonObjectData DRUpdateInIn) {
    DRUpdateIn = DRUpdateInIn;
  }

  public void translateFromMap() {
    DRUpdateIn = DiscReasonObjectHelper.fromMap(inputMap, "DiscReason");
  }

/**
 *
 * Gets the DiscReason
 * @return Value of the DiscReason
 *
 */

  public DiscReasonObjectData getDiscReason( ) {
    return DRUpdateIn;
  }

}
