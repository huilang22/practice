/*
 * Generated code DO NOT EDIT
 * Generated file: DiscReasonCreateBulkUdtTemplateItem.java
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
 * Class used to create a DiscReasonCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscReasonCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DiscReasonObjectData DRCreateIn;
/**
 *
 * Constructor to create a  DiscReasonCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscReasonCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, DiscReasonObjectData DRCreateInIn) {
    super(id, context, "DiscReasonCreate");
    DRCreateIn = DRCreateInIn;
  }

  public void translateToMap() {
    if (DRCreateIn != null) {
      DRCreateIn.resetFlags(true, true);
      addInput("DiscReason", DiscReasonObjectHelper.toMap(DRCreateIn, new HashMap(), "DiscReason").get("DiscReason"));
    }
  }


/**
 *
 * Sets the DiscReason
 * @param DRCreateInIn Value of the DRCreateIn
 *
 */

  public void setDiscReason(DiscReasonObjectData DRCreateInIn) {
    DRCreateIn = DRCreateInIn;
  }

  public void translateFromMap() {
    DRCreateIn = DiscReasonObjectHelper.fromMap(inputMap, "DiscReason");
  }

/**
 *
 * Gets the DiscReason
 * @return Value of the DiscReason
 *
 */

  public DiscReasonObjectData getDiscReason( ) {
    return DRCreateIn;
  }

}
