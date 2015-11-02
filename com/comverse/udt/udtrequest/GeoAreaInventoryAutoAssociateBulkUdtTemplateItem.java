/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAutoAssociateBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * Class used to create a GeoAreaInventoryAutoAssociateBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaInventoryAutoAssociateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData[] InvElementBulkIn;
  protected Integer InventoryId;
  protected Integer InventoryIdResets;
  protected String ServiceNumberLo;
  protected String ServiceNumberHi;
  protected Integer BoundaryId;
  protected Integer EnableAsync;
  protected String Email;
/**
 *
 * Constructor to create a  GeoAreaInventoryAutoAssociateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaInventoryAutoAssociateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData[] InvElementBulkInIn, Integer InventoryIdIn, Integer InventoryIdResetsIn, String ServiceNumberLoIn, String ServiceNumberHiIn, Integer BoundaryIdIn, Integer EnableAsyncIn, String EmailIn) {
    super(id, context, "GeoAreaInventoryAutoAssociate");
    InvElementBulkIn = InvElementBulkInIn;
    InventoryId = InventoryIdIn;
    InventoryIdResets = InventoryIdResetsIn;
    ServiceNumberLo = ServiceNumberLoIn;
    ServiceNumberHi = ServiceNumberHiIn;
    BoundaryId = BoundaryIdIn;
    EnableAsync = EnableAsyncIn;
    Email = EmailIn;
  }

  public void translateToMap() {
    if (InvElementBulkIn != null) {
      if (InvElementBulkIn != null) {
        Object[] list = new Object[InvElementBulkIn.length];
        for (int i = 0; i < InvElementBulkIn.length; i++) {
          list[i] = InvElementObjHelper.getMap(InvElementBulkIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "GeoAreaInventoryAutoAssociateOutputData");
        }
        addInput("InvElementBulkInList", list);
      }
    }
    if (InventoryId != null) {
      addInput("InventoryId", InventoryId);
    }
    if (InventoryIdResets != null) {
      addInput("InventoryIdResets", InventoryIdResets);
    }
    if (ServiceNumberLo != null) {
      addInput("ServiceNumberLo", ServiceNumberLo);
    }
    if (ServiceNumberHi != null) {
      addInput("ServiceNumberHi", ServiceNumberHi);
    }
    if (BoundaryId != null) {
      addInput("BoundaryId", BoundaryId);
    }
    if (EnableAsync != null) {
      addInput("EnableAsync", EnableAsync);
    }
    if (Email != null) {
      addInput("Email", Email);
    }
  }


/**
 *
 * Sets the InvElementBulkIn
 * @param InvElementBulkInIn Value of the InvElementBulkIn
 *
 */

  public void setInvElementBulkIn(InvElementObjData[] InvElementBulkInIn) {
    InvElementBulkIn = InvElementBulkInIn;
  }

/**
 *
 * Sets the InventoryId
 * @param InventoryIdIn Value of the InventoryId
 *
 */

  public void setInventoryId(Integer InventoryIdIn) {
    InventoryId = InventoryIdIn;
  }

/**
 *
 * Sets the InventoryIdResets
 * @param InventoryIdResetsIn Value of the InventoryIdResets
 *
 */

  public void setInventoryIdResets(Integer InventoryIdResetsIn) {
    InventoryIdResets = InventoryIdResetsIn;
  }

/**
 *
 * Sets the ServiceNumberLo
 * @param ServiceNumberLoIn Value of the ServiceNumberLo
 *
 */

  public void setServiceNumberLo(String ServiceNumberLoIn) {
    ServiceNumberLo = ServiceNumberLoIn;
  }

/**
 *
 * Sets the ServiceNumberHi
 * @param ServiceNumberHiIn Value of the ServiceNumberHi
 *
 */

  public void setServiceNumberHi(String ServiceNumberHiIn) {
    ServiceNumberHi = ServiceNumberHiIn;
  }

/**
 *
 * Sets the BoundaryId
 * @param BoundaryIdIn Value of the BoundaryId
 *
 */

  public void setBoundaryId(Integer BoundaryIdIn) {
    BoundaryId = BoundaryIdIn;
  }

/**
 *
 * Sets the EnableAsync
 * @param EnableAsyncIn Value of the EnableAsync
 *
 */

  public void setEnableAsync(Integer EnableAsyncIn) {
    EnableAsync = EnableAsyncIn;
  }

/**
 *
 * Sets the Email
 * @param EmailIn Value of the Email
 *
 */

  public void setEmail(String EmailIn) {
    Email = EmailIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("InvElementBulkInList");
    if (list != null) {
      InvElementBulkIn = new InvElementObjData[list.length];
      for (int i = 0; i < list.length; i++) {
        InvElementBulkIn[i] = InvElementObjHelper.getObj((Map) list[i]);
        InvElementBulkIn[i].resetFlags(true, true);
      }
    }
    InventoryId = (Integer)inputMap.get("InventoryId");
    InventoryIdResets = (Integer)inputMap.get("InventoryIdResets");
    ServiceNumberLo = (String)inputMap.get("ServiceNumberLo");
    ServiceNumberHi = (String)inputMap.get("ServiceNumberHi");
    BoundaryId = (Integer)inputMap.get("BoundaryId");
    EnableAsync = (Integer)inputMap.get("EnableAsync");
    Email = (String)inputMap.get("Email");
  }

/**
 *
 * Gets the InvElementBulkIn
 * @return Value of the InvElementBulkIn
 *
 */

  public InvElementObjData[] getInvElementBulkIn( ) {
    return InvElementBulkIn;
  }

/**
 *
 * Gets the InventoryId
 * @return Value of the InventoryId
 *
 */

  public Integer getInventoryId( ) {
    return InventoryId;
  }

/**
 *
 * Gets the InventoryIdResets
 * @return Value of the InventoryIdResets
 *
 */

  public Integer getInventoryIdResets( ) {
    return InventoryIdResets;
  }

/**
 *
 * Gets the ServiceNumberLo
 * @return Value of the ServiceNumberLo
 *
 */

  public String getServiceNumberLo( ) {
    return ServiceNumberLo;
  }

/**
 *
 * Gets the ServiceNumberHi
 * @return Value of the ServiceNumberHi
 *
 */

  public String getServiceNumberHi( ) {
    return ServiceNumberHi;
  }

/**
 *
 * Gets the BoundaryId
 * @return Value of the BoundaryId
 *
 */

  public Integer getBoundaryId( ) {
    return BoundaryId;
  }

/**
 *
 * Gets the EnableAsync
 * @return Value of the EnableAsync
 *
 */

  public Integer getEnableAsync( ) {
    return EnableAsync;
  }

/**
 *
 * Gets the Email
 * @return Value of the Email
 *
 */

  public String getEmail( ) {
    return Email;
  }

}
