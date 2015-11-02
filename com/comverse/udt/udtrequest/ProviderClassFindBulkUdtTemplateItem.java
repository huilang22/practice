/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProviderClassFindBulkUdtTemplateItem.java
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
 * Class used to create a ProviderClassFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ProviderClassFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProvClsObjectFilter ProvClsFindIn;
/**
 *
 * Constructor to create a  ProviderClassFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProviderClassFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ProvClsObjectFilter ProvClsFindInIn) {
    super(id, context, "ProviderClassFind");
    ProvClsFindIn = ProvClsFindInIn;
  }

  public void translateToMap() {
    if (ProvClsFindIn != null) {
      Integer index =  ProvClsFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProviderClass", ProvClsObjectHelper.toMap(ProvClsFindIn, new HashMap(), "ProviderClass").get("ProviderClass"));
    }
  }


/**
 *
 * Sets the ProviderClass
 * @param ProvClsFindInIn Value of the ProvClsFindIn
 *
 */

  public void setProviderClass(ProvClsObjectFilter ProvClsFindInIn) {
    ProvClsFindIn = ProvClsFindInIn;
  }

  public void translateFromMap() {
    ProvClsFindIn = ProvClsObjectHelper.fromMapFilter(inputMap, "ProviderClass");
  }

/**
 *
 * Gets the ProviderClass
 * @return Value of the ProviderClass
 *
 */

  public ProvClsObjectFilter getProviderClass( ) {
    return ProvClsFindIn;
  }

}
