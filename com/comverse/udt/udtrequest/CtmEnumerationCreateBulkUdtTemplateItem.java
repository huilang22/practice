/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmEnumerationCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a CtmEnumerationCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmEnumerationCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmEnumerationObjectData CtmEnumerationCreateIn;
/**
 *
 * Constructor to create a  CtmEnumerationCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmEnumerationCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmEnumerationObjectData CtmEnumerationCreateInIn) {
    super(id, context, "CtmEnumerationCreate");
    CtmEnumerationCreateIn = CtmEnumerationCreateInIn;
  }

  public void translateToMap() {
    if (CtmEnumerationCreateIn != null) {
      CtmEnumerationCreateIn.resetFlags(true, true);
      addInput("CtmEnumeration", CtmEnumerationObjectHelper.toMap(CtmEnumerationCreateIn, new HashMap(), "CtmEnumeration").get("CtmEnumeration"));
    }
  }


/**
 *
 * Sets the CtmEnumeration
 * @param CtmEnumerationCreateInIn Value of the CtmEnumerationCreateIn
 *
 */

  public void setCtmEnumeration(CtmEnumerationObjectData CtmEnumerationCreateInIn) {
    CtmEnumerationCreateIn = CtmEnumerationCreateInIn;
  }

  public void translateFromMap() {
    CtmEnumerationCreateIn = CtmEnumerationObjectHelper.fromMap(inputMap, "CtmEnumeration");
  }

/**
 *
 * Gets the CtmEnumeration
 * @return Value of the CtmEnumeration
 *
 */

  public CtmEnumerationObjectData getCtmEnumeration( ) {
    return CtmEnumerationCreateIn;
  }

}
