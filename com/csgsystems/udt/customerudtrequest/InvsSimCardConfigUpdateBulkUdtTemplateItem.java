/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimCardConfigUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsSimCardConfigUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimCardConfigUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimCardConfigObjectData InvsSimCardConfigUpdateIn;
/**
 *
 * Constructor to create a  InvsSimCardConfigUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimCardConfigUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimCardConfigObjectData InvsSimCardConfigUpdateInIn) {
    super(id, context, "InvsSimCardConfigUpdate");
    InvsSimCardConfigUpdateIn = InvsSimCardConfigUpdateInIn;
  }

  public void translateToMap() {
    if (InvsSimCardConfigUpdateIn != null) {
      InvsSimCardConfigUpdateIn.resetFlags(true, true);
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectHelper.toMap(InvsSimCardConfigUpdateIn, new HashMap(), "InvsSimCardConfig").get("InvsSimCardConfig"));
    }
  }


/**
 *
 * Sets the InvsSimCardConfig
 * @param InvsSimCardConfigUpdateInIn Value of the InvsSimCardConfigUpdateIn
 *
 */

  public void setInvsSimCardConfig(InvsSimCardConfigObjectData InvsSimCardConfigUpdateInIn) {
    InvsSimCardConfigUpdateIn = InvsSimCardConfigUpdateInIn;
  }

  public void translateFromMap() {
    InvsSimCardConfigUpdateIn = InvsSimCardConfigObjectHelper.fromMap(inputMap, "InvsSimCardConfig");
  }

/**
 *
 * Gets the InvsSimCardConfig
 * @return Value of the InvsSimCardConfig
 *
 */

  public InvsSimCardConfigObjectData getInvsSimCardConfig( ) {
    return InvsSimCardConfigUpdateIn;
  }

}
