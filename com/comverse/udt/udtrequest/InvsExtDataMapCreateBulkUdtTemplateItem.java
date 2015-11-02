/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsExtDataMapCreateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsExtDataMapCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsExtDataMapCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsExtDataMapObjectData InvsExtDataMapCreateIn;
/**
 *
 * Constructor to create a  InvsExtDataMapCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsExtDataMapCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsExtDataMapObjectData InvsExtDataMapCreateInIn) {
    super(id, context, "InvsExtDataMapCreate");
    InvsExtDataMapCreateIn = InvsExtDataMapCreateInIn;
  }

  public void translateToMap() {
    if (InvsExtDataMapCreateIn != null) {
      InvsExtDataMapCreateIn.resetFlags(true, true);
      addInput("InvsExtDataMap", InvsExtDataMapObjectHelper.toMap(InvsExtDataMapCreateIn, new HashMap(), "InvsExtDataMap").get("InvsExtDataMap"));
    }
  }


/**
 *
 * Sets the InvsExtDataMap
 * @param InvsExtDataMapCreateInIn Value of the InvsExtDataMapCreateIn
 *
 */

  public void setInvsExtDataMap(InvsExtDataMapObjectData InvsExtDataMapCreateInIn) {
    InvsExtDataMapCreateIn = InvsExtDataMapCreateInIn;
  }

  public void translateFromMap() {
    InvsExtDataMapCreateIn = InvsExtDataMapObjectHelper.fromMap(inputMap, "InvsExtDataMap");
  }

/**
 *
 * Gets the InvsExtDataMap
 * @return Value of the InvsExtDataMap
 *
 */

  public InvsExtDataMapObjectData getInvsExtDataMap( ) {
    return InvsExtDataMapCreateIn;
  }

}
