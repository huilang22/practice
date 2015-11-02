/*
 * Generated code DO NOT EDIT
 * Generated file: StatusReasonMapCreateBulkUdtTemplateItem.java
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
 * Class used to create a StatusReasonMapCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class StatusReasonMapCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SRMObjectData SRMCreateIn;
/**
 *
 * Constructor to create a  StatusReasonMapCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StatusReasonMapCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, SRMObjectData SRMCreateInIn) {
    super(id, context, "StatusReasonMapCreate");
    SRMCreateIn = SRMCreateInIn;
  }

  public void translateToMap() {
    if (SRMCreateIn != null) {
      SRMCreateIn.resetFlags(true, true);
      addInput("StatusReasonMap", SRMObjectHelper.toMap(SRMCreateIn, new HashMap(), "StatusReasonMap").get("StatusReasonMap"));
    }
  }


/**
 *
 * Sets the StatusReasonMap
 * @param SRMCreateInIn Value of the SRMCreateIn
 *
 */

  public void setStatusReasonMap(SRMObjectData SRMCreateInIn) {
    SRMCreateIn = SRMCreateInIn;
  }

  public void translateFromMap() {
    SRMCreateIn = SRMObjectHelper.fromMap(inputMap, "StatusReasonMap");
  }

/**
 *
 * Gets the StatusReasonMap
 * @return Value of the StatusReasonMap
 *
 */

  public SRMObjectData getStatusReasonMap( ) {
    return SRMCreateIn;
  }

}
