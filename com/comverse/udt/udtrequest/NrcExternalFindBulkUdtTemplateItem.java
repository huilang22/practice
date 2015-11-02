/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcExternalFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a NrcExternalFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcExternalFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectFilter NSEXFindIn;
  protected Boolean __viewable_only;
/**
 *
 * Constructor to create a  NrcExternalFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcExternalFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectFilter NSEXFindInIn, Boolean __viewable_onlyIn) {
    super(id, context, "NrcExternalFind");
    NSEXFindIn = NSEXFindInIn;
    __viewable_only = __viewable_onlyIn;
  }

  public void translateToMap() {
    if (NSEXFindIn != null) {
      Integer index =  NSEXFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Nrc", NrcObjectHelper.toMap(NSEXFindIn, new HashMap(), "Nrc").get("Nrc"));
    }
    if (__viewable_only != null) {
      addInput("ViewableOnly", __viewable_only);
    }
  }


/**
 *
 * Sets the Nrc
 * @param NSEXFindInIn Value of the NSEXFindIn
 *
 */

  public void setNrc(NrcObjectFilter NSEXFindInIn) {
    NSEXFindIn = NSEXFindInIn;
  }

/**
 *
 * Sets the ViewableOnly
 * @param __viewable_onlyIn Value of the __viewable_only
 *
 */

  public void setViewableOnly(Boolean __viewable_onlyIn) {
    __viewable_only = __viewable_onlyIn;
  }

  public void translateFromMap() {
    NSEXFindIn = NrcObjectHelper.fromMapFilter(inputMap, "Nrc");
    __viewable_only = (Boolean)inputMap.get("ViewableOnly");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectFilter getNrc( ) {
    return NSEXFindIn;
  }

/**
 *
 * Gets the ViewableOnly
 * @return Value of the ViewableOnly
 *
 */

  public Boolean getViewableOnly( ) {
    return __viewable_only;
  }

}
