/*
 * Generated code DO NOT EDIT
 * Generated file: SpecialDestinationTypeUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a SpecialDestinationTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class SpecialDestinationTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SpecialDestinationTypeObjectData sdUpdIn;
/**
 *
 * Constructor to create a  SpecialDestinationTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SpecialDestinationTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, SpecialDestinationTypeObjectData sdUpdInIn) {
    super(id, context, "SpecialDestinationTypeUpdate");
    sdUpdIn = sdUpdInIn;
  }

  public void translateToMap() {
    if (sdUpdIn != null) {
      sdUpdIn.resetFlags(true, true);
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectHelper.toMap(sdUpdIn, new HashMap(), "SpecialDestinationType").get("SpecialDestinationType"));
    }
  }


/**
 *
 * Sets the SpecialDestinationType
 * @param sdUpdInIn Value of the sdUpdIn
 *
 */

  public void setSpecialDestinationType(SpecialDestinationTypeObjectData sdUpdInIn) {
    sdUpdIn = sdUpdInIn;
  }

  public void translateFromMap() {
    sdUpdIn = SpecialDestinationTypeObjectHelper.fromMap(inputMap, "SpecialDestinationType");
  }

/**
 *
 * Gets the SpecialDestinationType
 * @return Value of the SpecialDestinationType
 *
 */

  public SpecialDestinationTypeObjectData getSpecialDestinationType( ) {
    return sdUpdIn;
  }

}
