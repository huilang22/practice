/*
 * Generated code DO NOT EDIT
 * Generated file: PointClassGetBulkUdtTemplateItem.java
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
 * Class used to create a PointClassGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PointClassGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PointClassObjectKeyData PCGetIn;
/**
 *
 * Constructor to create a  PointClassGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PointClassGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PointClassObjectKeyData PCGetInIn) {
    super(id, context, "PointClassGet");
    PCGetIn = PCGetInIn;
  }

  public void translateToMap() {
    if (PCGetIn != null) {
      PCGetIn.resetFlags(true, true);
      addInput("PointClass", PointClassObjectKeyHelper.toMap(PCGetIn, new HashMap(), "PointClassObjectKeyData").get("PointClassObjectKeyData"));
    }
  }


/**
 *
 * Sets the PointClass
 * @param PCGetInIn Value of the PCGetIn
 *
 */

  public void setPointClass(PointClassObjectKeyData PCGetInIn) {
    PCGetIn = PCGetInIn;
  }

  public void translateFromMap() {
    PCGetIn = PointClassObjectKeyHelper.fromMap(inputMap, "PointClass");
  }

/**
 *
 * Gets the PointClass
 * @return Value of the PointClass
 *
 */

  public PointClassObjectKeyData getPointClass( ) {
    return PCGetIn;
  }

}
