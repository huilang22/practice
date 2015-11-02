/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingTypeCreateBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcRatingTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcRatingTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcRatingTypeObjectData CreateIn;
/**
 *
 * Constructor to create a  CtcRatingTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcRatingTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcRatingTypeObjectData CreateInIn) {
    super(id, context, "CtcRatingTypeCreate");
    CreateIn = CreateInIn;
  }

  public void translateToMap() {
    if (CreateIn != null) {
      CreateIn.resetFlags(true, true);
      addInput("CtcRatingType", CtcRatingTypeObjectHelper.toMap(CreateIn, new HashMap(), "CtcRatingType").get("CtcRatingType"));
    }
  }


/**
 *
 * Sets the CtcRatingType
 * @param CreateInIn Value of the CreateIn
 *
 */

  public void setCtcRatingType(CtcRatingTypeObjectData CreateInIn) {
    CreateIn = CreateInIn;
  }

  public void translateFromMap() {
    CreateIn = CtcRatingTypeObjectHelper.fromMap(inputMap, "CtcRatingType");
  }

/**
 *
 * Gets the CtcRatingType
 * @return Value of the CtcRatingType
 *
 */

  public CtcRatingTypeObjectData getCtcRatingType( ) {
    return CreateIn;
  }

}
