/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BoundaryListActiveBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * Class used to create a BoundaryListActiveBulkUdtTemplateItem Bulk Template
 *
 */

public class BoundaryListActiveBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer object_type_i;
  protected Integer boundary_id_i;
/**
 *
 * Constructor to create a  BoundaryListActiveBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BoundaryListActiveBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer object_type_iIn, Integer boundary_id_iIn) {
    super(id, context, "BoundaryListActive");
    object_type_i = object_type_iIn;
    boundary_id_i = boundary_id_iIn;
  }

  public void translateToMap() {
    if (object_type_i != null) {
      addInput("ObjectTypeI", object_type_i);
    }
    if (boundary_id_i != null) {
      addInput("BoundaryIdI", boundary_id_i);
    }
  }


/**
 *
 * Sets the ObjectTypeI
 * @param object_type_iIn Value of the object_type_i
 *
 */

  public void setObjectTypeI(Integer object_type_iIn) {
    object_type_i = object_type_iIn;
  }

/**
 *
 * Sets the BoundaryIdI
 * @param boundary_id_iIn Value of the boundary_id_i
 *
 */

  public void setBoundaryIdI(Integer boundary_id_iIn) {
    boundary_id_i = boundary_id_iIn;
  }

  public void translateFromMap() {
    object_type_i = (Integer)inputMap.get("ObjectTypeI");
    boundary_id_i = (Integer)inputMap.get("BoundaryIdI");
  }

/**
 *
 * Gets the ObjectTypeI
 * @return Value of the ObjectTypeI
 *
 */

  public Integer getObjectTypeI( ) {
    return object_type_i;
  }

/**
 *
 * Gets the BoundaryIdI
 * @return Value of the BoundaryIdI
 *
 */

  public Integer getBoundaryIdI( ) {
    return boundary_id_i;
  }

}
