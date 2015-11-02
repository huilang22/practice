/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenericEnumerationFindBulkUdtTemplateItem.java
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

/**
 *
 * Class used to create a GenericEnumerationFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GenericEnumerationFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GEObjectFilter GEFindIn;
/**
 *
 * Constructor to create a  GenericEnumerationFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GenericEnumerationFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GEObjectFilter GEFindInIn) {
    super(id, context, "GenericEnumerationFind");
    GEFindIn = GEFindInIn;
  }

  public void translateToMap() {
    if (GEFindIn != null) {
      Integer index =  GEFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GenericEnumeration", GEObjectHelper.toMap(GEFindIn, new HashMap(), "GenericEnumeration").get("GenericEnumeration"));
    }
  }


/**
 *
 * Sets the GenericEnumeration
 * @param GEFindInIn Value of the GEFindIn
 *
 */

  public void setGenericEnumeration(GEObjectFilter GEFindInIn) {
    GEFindIn = GEFindInIn;
  }

  public void translateFromMap() {
    GEFindIn = GEObjectHelper.fromMapFilter(inputMap, "GenericEnumeration");
  }

/**
 *
 * Gets the GenericEnumeration
 * @return Value of the GenericEnumeration
 *
 */

  public GEObjectFilter getGenericEnumeration( ) {
    return GEFindIn;
  }

}
