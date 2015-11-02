/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProviderClassCreateBulkUdtTemplateItem.java
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
 * Class used to create a ProviderClassCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProviderClassCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProvClsObjectData ProvClsCreateIn;
/**
 *
 * Constructor to create a  ProviderClassCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProviderClassCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProvClsObjectData ProvClsCreateInIn) {
    super(id, context, "ProviderClassCreate");
    ProvClsCreateIn = ProvClsCreateInIn;
  }

  public void translateToMap() {
    if (ProvClsCreateIn != null) {
      ProvClsCreateIn.resetFlags(true, true);
      addInput("ProviderClass", ProvClsObjectHelper.toMap(ProvClsCreateIn, new HashMap(), "ProviderClass").get("ProviderClass"));
    }
  }


/**
 *
 * Sets the ProviderClass
 * @param ProvClsCreateInIn Value of the ProvClsCreateIn
 *
 */

  public void setProviderClass(ProvClsObjectData ProvClsCreateInIn) {
    ProvClsCreateIn = ProvClsCreateInIn;
  }

  public void translateFromMap() {
    ProvClsCreateIn = ProvClsObjectHelper.fromMap(inputMap, "ProviderClass");
  }

/**
 *
 * Gets the ProviderClass
 * @return Value of the ProviderClass
 *
 */

  public ProvClsObjectData getProviderClass( ) {
    return ProvClsCreateIn;
  }

}
