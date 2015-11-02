/*
 * Generated code DO NOT EDIT
 * Generated file: DescriptionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a DescriptionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class DescriptionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DescriptionObjectData DescriptionUpdateIn;
/**
 *
 * Constructor to create a  DescriptionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DescriptionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, DescriptionObjectData DescriptionUpdateInIn) {
    super(id, context, "DescriptionUpdate");
    DescriptionUpdateIn = DescriptionUpdateInIn;
  }

  public void translateToMap() {
    if (DescriptionUpdateIn != null) {
      DescriptionUpdateIn.resetFlags(true, true);
      addInput("Description", DescriptionObjectHelper.toMap(DescriptionUpdateIn, new HashMap(), "Description").get("Description"));
    }
  }


/**
 *
 * Sets the Description
 * @param DescriptionUpdateInIn Value of the DescriptionUpdateIn
 *
 */

  public void setDescription(DescriptionObjectData DescriptionUpdateInIn) {
    DescriptionUpdateIn = DescriptionUpdateInIn;
  }

  public void translateFromMap() {
    DescriptionUpdateIn = DescriptionObjectHelper.fromMap(inputMap, "Description");
  }

/**
 *
 * Gets the Description
 * @return Value of the Description
 *
 */

  public DescriptionObjectData getDescription( ) {
    return DescriptionUpdateIn;
  }

}
