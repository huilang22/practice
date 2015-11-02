/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmEnumerationFindBulkUdtTemplateItem.java
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
 * Class used to create a CtmEnumerationFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmEnumerationFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmEnumerationObjectFilter CtmEnumerationFindIn;
/**
 *
 * Constructor to create a  CtmEnumerationFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmEnumerationFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmEnumerationObjectFilter CtmEnumerationFindInIn) {
    super(id, context, "CtmEnumerationFind");
    CtmEnumerationFindIn = CtmEnumerationFindInIn;
  }

  public void translateToMap() {
    if (CtmEnumerationFindIn != null) {
      Integer index =  CtmEnumerationFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtmEnumeration", CtmEnumerationObjectHelper.toMap(CtmEnumerationFindIn, new HashMap(), "CtmEnumeration").get("CtmEnumeration"));
    }
  }


/**
 *
 * Sets the CtmEnumeration
 * @param CtmEnumerationFindInIn Value of the CtmEnumerationFindIn
 *
 */

  public void setCtmEnumeration(CtmEnumerationObjectFilter CtmEnumerationFindInIn) {
    CtmEnumerationFindIn = CtmEnumerationFindInIn;
  }

  public void translateFromMap() {
    CtmEnumerationFindIn = CtmEnumerationObjectHelper.fromMapFilter(inputMap, "CtmEnumeration");
  }

/**
 *
 * Gets the CtmEnumeration
 * @return Value of the CtmEnumeration
 *
 */

  public CtmEnumerationObjectFilter getCtmEnumeration( ) {
    return CtmEnumerationFindIn;
  }

}
