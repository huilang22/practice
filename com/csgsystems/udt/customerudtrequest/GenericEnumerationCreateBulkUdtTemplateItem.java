/*
 * Generated code DO NOT EDIT
 * Generated file: GenericEnumerationCreateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a GenericEnumerationCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class GenericEnumerationCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GEObjectData GECreateIn;
/**
 *
 * Constructor to create a  GenericEnumerationCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GenericEnumerationCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, GEObjectData GECreateInIn) {
    super(id, context, "GenericEnumerationCreate");
    GECreateIn = GECreateInIn;
  }

  public void translateToMap() {
    if (GECreateIn != null) {
      GECreateIn.resetFlags(true, true);
      addInput("GenericEnumeration", GEObjectHelper.toMap(GECreateIn, new HashMap(), "GenericEnumeration").get("GenericEnumeration"));
    }
  }


/**
 *
 * Sets the GenericEnumeration
 * @param GECreateInIn Value of the GECreateIn
 *
 */

  public void setGenericEnumeration(GEObjectData GECreateInIn) {
    GECreateIn = GECreateInIn;
  }

  public void translateFromMap() {
    GECreateIn = GEObjectHelper.fromMap(inputMap, "GenericEnumeration");
  }

/**
 *
 * Gets the GenericEnumeration
 * @return Value of the GenericEnumeration
 *
 */

  public GEObjectData getGenericEnumeration( ) {
    return GECreateIn;
  }

}
