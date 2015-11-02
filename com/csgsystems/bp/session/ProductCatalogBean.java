
/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Bean_J.xslt
 * Generated  File: ProductCatalogBean.java
 * Definition File: Admin/ProductCatalog.xml
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Current generator limitations
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Object Summary Information
 *---------------------------------------------------------------------------*/
 /**--------------------------------------------------------------------------
 * Product    : BP
 *----------------------------------------------------------------------------
 *----------------------------------------------------------------------------
 * Copyright 2006 Comverse, Inc.  All Rights Reserved.
 *----------------------------------------------------------------------------
 */

package com.csgsystems.bp.session;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.ejb.*;
import javax.naming.*;
import javax.resource.*;
import javax.resource.cci.*;

import com.csgsystems.api.defaults.*;
import com.csgsystems.api.constraint.*;

import com.csgsystems.aruba.connection.BSDMConnectionManager;
import com.csgsystems.aruba.connection.BSDMConnectionSpec;
import com.csgsystems.aruba.connection.BSDMInteractionSpec;
import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.aruba.connection.BSDMSettings;
import com.csgsystems.bali.connection.ApiMappings;

import javax.ejb.Stateless;  
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.BeanParam;
import javax.inject.Inject;



import com.csgsystems.bp.data.*;
import com.csgsystems.bp.interfaces.ProductCatalogInterface;
import com.csgsystems.cf.data.*;
import com.csgsystems.cf.data.*;
import com.csgsystems.cf.data.*;
import com.csgsystems.cf.data.*;
import com.csgsystems.cf.data.*;
import com.csgsystems.cf.data.*;
import com.csgsystems.cf.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 * @ejb:bean name="ProductCatalogSessionBean"
 * display-name="ProductCatalog Stateless Session EJB/>"
 * type="Stateless"
 * jndi-name="ejb/ProductCatalogBean"
 * transaction-type="Bean"
 * @ejb:permission role-name="ArubaUser"
 * @ejb:security-identity run-as="ArubaUser"
 * @ejb:resource-ref res-name="BSDMEIS"
 * res-type="javax.resource.cci.ConnectionFactory"
 * res-auth="Container"
 * @jboss:resource-manager res-man-class="javax.resource.cci.ConnectionFactory"
 * res-man-name="BSDMEIS"
 * res-man-jndi-name="java:/eis/JNITux"
 * @weblogic:resource-description res-ref-name="BSDMEIS"
 * jndi-name="eis/JNITux"
 * @websphere:resource-ref res-name="BSDMEIS"
 * jndi-name="eis/JNITux"
 * @jrun:resource-ref resource-ref-name="BSDMEIS"
 * jndi-name="eis/JNITux"
 * @ejb:transaction type="NotSupported"
 * @ejb:bean view-type="remote"
 */

@Stateless(name="ProductCatalogBean", mappedName = "ProductCatalog")
@TransactionManagement(TransactionManagementType.BEAN)

@Path("ProductCatalogs")

public class ProductCatalogBean implements ProductCatalogInterface
{
  protected ConnectionFactory cf       = null;
  protected SessionContext    sc       = null;
  @Inject protected BSDMSettings settings = null; 

  private BSDMInteractionSpec _ContractTypeFindEligibleSpec = null;
  /**
   * Finds eligible ContractTypes.
   * Convenience method using default BSDMSessionContext.
   * @param entity Input List Object.
   * @param contract_type Input Filter Object.
   * @param effective_date (has a default).
   * @param _check_type (null is allowed) (has a default).
   * @return ContractTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ContractTypeObjectDataList contractTypeFindEligible (EntityObjectData[] entity, ContractTypeObjectFilter contract_type, Date effective_date, Integer _check_type) throws BSDMResourceException
  {
    return contractTypeFindEligible (null, entity, contract_type, effective_date, _check_type);
  }
  /**
   * Finds eligible ContractTypes.
   * @param context The session context to use when connecting to the APITS server.
   * @param entity Input List Object.
   * @param contract_type Input Filter Object.
   * @param effective_date (has a default).
   * @param _check_type (null is allowed) (has a default).
   * @return ContractTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("contractTypeFindEligible")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ContractTypeObjectDataList contractTypeFindEligible (@HeaderParam ("context")BSDMSessionContext context,EntityObjectData[] entity,@FormParam("ContractTypeObject")ContractTypeObjectFilter contract_type,@FormParam("effective_date")Date effective_date,@FormParam("_check_type")Integer _check_type) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ContractTypeFindEligibleSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (effective_date != null) record.put ("EffectiveDate", effective_date);
      if (entity != null)
    {
      Object[] list = new Object[entity.length];
      for (int i = 0; i < entity.length; i++)
      {
        list[i] = null;
        list[i] = EntityObjectHelper.getMap (entity[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      record.put ("EntityList", list);
    }
      if (contract_type != null) ContractTypeObjectHelper.toMap (contract_type, record, "ContractType");

      if (_check_type != null) record.put ("CheckType", _check_type);
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return ContractTypeObjectHelper.fromMapList (record, "ContractTypeList");
}

  private BSDMInteractionSpec _NrcTransDescrFindEligibleSpec = null;
  /**
   * Finds eligible NrcTransDescrs.
   * Convenience method using default BSDMSessionContext.
   * @param _entity Input List Object.
   * @param nrc_trans_descr Input Filter Object.
   * @param _effective_date (has a default).
   * @param __check_type (null is allowed) (has a default).
   * @return NrcTransDescrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public NrcTransDescrObjectDataList nrcTransDescrFindEligible (EntityObjectData[] _entity, NrcTransDescrObjectFilter nrc_trans_descr, Date _effective_date, Integer __check_type) throws BSDMResourceException
  {
    return nrcTransDescrFindEligible (null, _entity, nrc_trans_descr, _effective_date, __check_type);
  }
  /**
   * Finds eligible NrcTransDescrs.
   * @param context The session context to use when connecting to the APITS server.
   * @param _entity Input List Object.
   * @param nrc_trans_descr Input Filter Object.
   * @param _effective_date (has a default).
   * @param __check_type (null is allowed) (has a default).
   * @return NrcTransDescrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("nrcTransDescrFindEligible")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public NrcTransDescrObjectDataList nrcTransDescrFindEligible (@HeaderParam ("context")BSDMSessionContext context,EntityObjectData[] _entity,@FormParam("NrcTransDescrObject")NrcTransDescrObjectFilter nrc_trans_descr,@FormParam("_effective_date")Date _effective_date,@FormParam("__check_type")Integer __check_type) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_NrcTransDescrFindEligibleSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (_effective_date != null) record.put ("EffectiveDate", _effective_date);
      if (_entity != null)
    {
      Object[] list = new Object[_entity.length];
      for (int i = 0; i < _entity.length; i++)
      {
        list[i] = null;
        list[i] = EntityObjectHelper.getMap (_entity[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      record.put ("EntityList", list);
    }
      if (nrc_trans_descr != null) NrcTransDescrObjectHelper.toMap (nrc_trans_descr, record, "NrcTransDescr");

      if (__check_type != null) record.put ("CheckType", __check_type);
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return NrcTransDescrObjectHelper.fromMapList (record, "NrcTransDescrList");
}

  private BSDMInteractionSpec _ProductElementFindEligibleSpec = null;
  /**
   * Finds eligible ProductElements.
   * Convenience method using default BSDMSessionContext.
   * @param __entity Input List Object.
   * @param product_element Input Filter Object.
   * @param address_id (null is allowed).
   * @param industry_type (null is allowed).
   * @param __effective_date (has a default).
   * @param ___check_type (null is allowed) (has a default).
   * @return ProductElementObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ProductElementObjectDataList productElementFindEligible (EntityObjectData[] __entity, ProductElementObjectFilter product_element, Integer address_id, Integer[] industry_type, Date __effective_date, Integer ___check_type) throws BSDMResourceException
  {
    return productElementFindEligible (null, __entity, product_element, address_id, industry_type, __effective_date, ___check_type);
  }
  /**
   * Finds eligible ProductElements.
   * @param context The session context to use when connecting to the APITS server.
   * @param __entity Input List Object.
   * @param product_element Input Filter Object.
   * @param address_id (null is allowed).
   * @param industry_type (null is allowed).
   * @param __effective_date (has a default).
   * @param ___check_type (null is allowed) (has a default).
   * @return ProductElementObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("productElementFindEligible")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ProductElementObjectDataList productElementFindEligible (@HeaderParam ("context")BSDMSessionContext context,EntityObjectData[] __entity,@FormParam("ProductElementObject")ProductElementObjectFilter product_element,@FormParam("address_id")Integer address_id,@FormParam("industry_type")Integer[] industry_type,@FormParam("__effective_date")Date __effective_date,@FormParam("___check_type")Integer ___check_type) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ProductElementFindEligibleSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (address_id != null) record.put ("AddressId", address_id);

      if (industry_type != null) record.put ("IndustryTypeList", industry_type);

      if (__effective_date != null) record.put ("EffectiveDate", __effective_date);
      if (__entity != null)
    {
      Object[] list = new Object[__entity.length];
      for (int i = 0; i < __entity.length; i++)
      {
        list[i] = null;
        list[i] = EntityObjectHelper.getMap (__entity[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      record.put ("EntityList", list);
    }
      if (product_element != null) ProductElementObjectHelper.toMap (product_element, record, "ProductElement");

      if (___check_type != null) record.put ("CheckType", ___check_type);
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return ProductElementObjectHelper.fromMapList (record, "ProductElementList");
}

  private BSDMInteractionSpec _PackageDefinitionFindEligibleSpec = null;
  /**
   * Finds eligible PackageDefinitions.
   * Convenience method using default BSDMSessionContext.
   * @param ___entity Input List Object.
   * @param package_definition Input Filter Object.
   * @param ___address_id (null is allowed).
   * @param ___industry_type (null is allowed).
   * @param ___effective_date (has a default).
   * @param level (has a default).
   * @param ____check_type (null is allowed) (has a default).
   * @return PDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PDObjectDataList packageDefinitionFindEligible (EntityObjectData[] ___entity, PDObjectFilter package_definition, Integer ___address_id, Integer[] ___industry_type, Date ___effective_date, Integer level, Integer ____check_type) throws BSDMResourceException
  {
    return packageDefinitionFindEligible (null, ___entity, package_definition, ___address_id, ___industry_type, ___effective_date, level, ____check_type);
  }
  /**
   * Finds eligible PackageDefinitions.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___entity Input List Object.
   * @param package_definition Input Filter Object.
   * @param ___address_id (null is allowed).
   * @param ___industry_type (null is allowed).
   * @param ___effective_date (has a default).
   * @param level (has a default).
   * @param ____check_type (null is allowed) (has a default).
   * @return PDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("packageDefinitionFindEligible")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PDObjectDataList packageDefinitionFindEligible (@HeaderParam ("context")BSDMSessionContext context,EntityObjectData[] ___entity,@FormParam("PDObject")PDObjectFilter package_definition,@FormParam("___address_id")Integer ___address_id,@FormParam("___industry_type")Integer[] ___industry_type,@FormParam("___effective_date")Date ___effective_date,@FormParam("level")Integer level,@FormParam("____check_type")Integer ____check_type) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PackageDefinitionFindEligibleSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (___address_id != null) record.put ("AddressId", ___address_id);

      if (___industry_type != null) record.put ("IndustryTypeList", ___industry_type);

      if (___effective_date != null) record.put ("EffectiveDate", ___effective_date);

      if (level != null) record.put ("Level", level);
      if (___entity != null)
    {
      Object[] list = new Object[___entity.length];
      for (int i = 0; i < ___entity.length; i++)
      {
        list[i] = null;
        list[i] = EntityObjectHelper.getMap (___entity[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      record.put ("EntityList", list);
    }
      if (package_definition != null) PDObjectHelper.toMap (package_definition, record, "PackageDefinition");

      if (____check_type != null) record.put ("CheckType", ____check_type);
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return PDObjectHelper.fromMapList (record, "PackageDefinitionList");
}

  private BSDMInteractionSpec _ExternalIdTypeFindEligibleSpec = null;
  /**
   * Finds eligible ExternalIdTypes.
   * Convenience method using default BSDMSessionContext.
   * @param ____entity Input List Object.
   * @param external_id_type Input Filter Object.
   * @param ____effective_date (has a default).
   * @param _____check_type (null is allowed) (has a default).
   * @return ExternalIdTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ExternalIdTypeObjectDataList externalIdTypeFindEligible (EntityObjectData[] ____entity, ExternalIdTypeObjectFilter external_id_type, Date ____effective_date, Integer _____check_type) throws BSDMResourceException
  {
    return externalIdTypeFindEligible (null, ____entity, external_id_type, ____effective_date, _____check_type);
  }
  /**
   * Finds eligible ExternalIdTypes.
   * @param context The session context to use when connecting to the APITS server.
   * @param ____entity Input List Object.
   * @param external_id_type Input Filter Object.
   * @param ____effective_date (has a default).
   * @param _____check_type (null is allowed) (has a default).
   * @return ExternalIdTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("externalIdTypeFindEligible")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ExternalIdTypeObjectDataList externalIdTypeFindEligible (@HeaderParam ("context")BSDMSessionContext context,EntityObjectData[] ____entity,@FormParam("ExternalIdTypeObject")ExternalIdTypeObjectFilter external_id_type,@FormParam("____effective_date")Date ____effective_date,@FormParam("_____check_type")Integer _____check_type) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ExternalIdTypeFindEligibleSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (____effective_date != null) record.put ("EffectiveDate", ____effective_date);
      if (____entity != null)
    {
      Object[] list = new Object[____entity.length];
      for (int i = 0; i < ____entity.length; i++)
      {
        list[i] = null;
        list[i] = EntityObjectHelper.getMap (____entity[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      record.put ("EntityList", list);
    }
      if (external_id_type != null) ExternalIdTypeObjectHelper.toMap (external_id_type, record, "ExternalIdType");

      if (_____check_type != null) record.put ("CheckType", _____check_type);
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return ExternalIdTypeObjectHelper.fromMapList (record, "ExternalIdTypeList");
}

  private BSDMInteractionSpec _ServicePricingPlanFindEligibleSpec = null;
  /**
   * Finds eligible ServicePricingPlans.
   * Convenience method using default BSDMSessionContext.
   * @param _____entity Input List Object.
   * @param service_pricing_plan Input Filter Object.
   * @param _____effective_date (has a default).
   * @param _address_id (null is allowed).
   * @param __industry_type (null is allowed).
   * @param check_type (null is allowed) (has a default).
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public ServicePricingPlanObjectDataList servicePricingPlanFindEligible (EntityObjectData[] _____entity, ServicePricingPlanObjectFilter service_pricing_plan, Date _____effective_date, Integer _address_id, Integer[] __industry_type, Integer check_type) throws BSDMResourceException
  {
    return servicePricingPlanFindEligible (null, _____entity, service_pricing_plan, _____effective_date, _address_id, __industry_type, check_type);
  }
  /**
   * Finds eligible ServicePricingPlans.
   * @param context The session context to use when connecting to the APITS server.
   * @param _____entity Input List Object.
   * @param service_pricing_plan Input Filter Object.
   * @param _____effective_date (has a default).
   * @param _address_id (null is allowed).
   * @param __industry_type (null is allowed).
   * @param check_type (null is allowed) (has a default).
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("servicePricingPlanFindEligible")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public ServicePricingPlanObjectDataList servicePricingPlanFindEligible (@HeaderParam ("context")BSDMSessionContext context,EntityObjectData[] _____entity,@FormParam("ServicePricingPlanObject")ServicePricingPlanObjectFilter service_pricing_plan,@FormParam("_____effective_date")Date _____effective_date,@FormParam("_address_id")Integer _address_id,@FormParam("__industry_type")Integer[] __industry_type,@FormParam("check_type")Integer check_type) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_ServicePricingPlanFindEligibleSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (_____effective_date != null) record.put ("EffectiveDate", _____effective_date);
      if (_____entity != null)
    {
      Object[] list = new Object[_____entity.length];
      for (int i = 0; i < _____entity.length; i++)
      {
        list[i] = null;
        list[i] = EntityObjectHelper.getMap (_____entity[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      record.put ("EntityList", list);
    }

      if (_address_id != null) record.put ("AddressId", _address_id);

      if (__industry_type != null) record.put ("IndustryTypeList", __industry_type);
      if (service_pricing_plan != null) ServicePricingPlanObjectHelper.toMap (service_pricing_plan, record, "ServicePricingPlan");

      if (check_type != null) record.put ("CheckType", check_type);
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return ServicePricingPlanObjectHelper.fromMapList (record, "ServicePricingPlanList");
}

  private BSDMInteractionSpec _PackageComponentDefFindEligibleSpec = null;
  /**
   * Finds eligible PackageComponentDefs.
   * Convenience method using default BSDMSessionContext.
   * @param ______entity Input List Object.
   * @param package_component_def Input Filter Object.
   * @param ______address_id (null is allowed).
   * @param ______industry_type (null is allowed).
   * @param ______effective_date (has a default).
   * @param ______check_type (null is allowed) (has a default).
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public PCDObjectDataList packageComponentDefFindEligible (EntityObjectData[] ______entity, PCDObjectFilter package_component_def, Integer ______address_id, Integer[] ______industry_type, Date ______effective_date, Integer ______check_type) throws BSDMResourceException
  {
    return packageComponentDefFindEligible (null, ______entity, package_component_def, ______address_id, ______industry_type, ______effective_date, ______check_type);
  }
  /**
   * Finds eligible PackageComponentDefs.
   * @param context The session context to use when connecting to the APITS server.
   * @param ______entity Input List Object.
   * @param package_component_def Input Filter Object.
   * @param ______address_id (null is allowed).
   * @param ______industry_type (null is allowed).
   * @param ______effective_date (has a default).
   * @param ______check_type (null is allowed) (has a default).
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("packageComponentDefFindEligible")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public PCDObjectDataList packageComponentDefFindEligible (@HeaderParam ("context")BSDMSessionContext context,EntityObjectData[] ______entity,@FormParam("PCDObject")PCDObjectFilter package_component_def,@FormParam("______address_id")Integer ______address_id,@FormParam("______industry_type")Integer[] ______industry_type,@FormParam("______effective_date")Date ______effective_date,@FormParam("______check_type")Integer ______check_type) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_PackageComponentDefFindEligibleSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (______address_id != null) record.put ("AddressId", ______address_id);

      if (______industry_type != null) record.put ("IndustryTypeList", ______industry_type);

      if (______effective_date != null) record.put ("EffectiveDate", ______effective_date);
      if (______entity != null)
    {
      Object[] list = new Object[______entity.length];
      for (int i = 0; i < ______entity.length; i++)
      {
        list[i] = null;
        list[i] = EntityObjectHelper.getMap (______entity[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      record.put ("EntityList", list);
    }
      if (package_component_def != null) PCDObjectHelper.toMap (package_component_def, record, "PackageComponentDef");

      if (______check_type != null) record.put ("CheckType", ______check_type);
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return PCDObjectHelper.fromMapList (record, "PackageComponentDefList");
}

  private BSDMInteractionSpec _InvsTypeFindEligibleSpec = null;
  /**
   * Finds eligible PackageComponentDefs.
   * Convenience method using default BSDMSessionContext.
   * @param ________entity Input List Object.
   * @param invs_type Input Filter Object.
   * @param ________address_id (null is allowed).
   * @param ________effective_date (has a default).
   * @param _______check_type (null is allowed) (has a default).
   * @return InvsTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
   
   
  public InvsTypeObjectDataList invsTypeFindEligible (EntityObjectData[] ________entity, InvsTypeObjectFilter invs_type, Integer ________address_id, Date ________effective_date, Integer _______check_type) throws BSDMResourceException
  {
    return invsTypeFindEligible (null, ________entity, invs_type, ________address_id, ________effective_date, _______check_type);
  }
  /**
   * Finds eligible PackageComponentDefs.
   * @param context The session context to use when connecting to the APITS server.
   * @param ________entity Input List Object.
   * @param invs_type Input Filter Object.
   * @param ________address_id (null is allowed).
   * @param ________effective_date (has a default).
   * @param _______check_type (null is allowed) (has a default).
   * @return InvsTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @ejb:interface-method view-type="remote"
   */
@POST
@Path("invsTypeFindEligible")
@Consumes({"application/json","application/xml"})
@Produces({"application/json","application/xml"})
 public InvsTypeObjectDataList invsTypeFindEligible (@HeaderParam ("context")BSDMSessionContext context,EntityObjectData[] ________entity,@FormParam("InvsTypeObject")InvsTypeObjectFilter invs_type,@FormParam("________address_id")Integer ________address_id,@FormParam("________effective_date")Date ________effective_date,@FormParam("_______check_type")Integer _______check_type) throws BSDMResourceException
{
BSDMResourceException cex = null;
BSDMInteractionSpec   spec = new BSDMInteractionSpec (_InvsTypeFindEligibleSpec, context);
MappedRecord record       = null;
Connection connection     = null;
Interaction interaction   = null;
try
{
record = cf.getRecordFactory ().createMappedRecord (null);

      if (________address_id != null) record.put ("AddressId", ________address_id);

      if (________effective_date != null) record.put ("EffectiveDate", ________effective_date);
      if (________entity != null)
    {
      Object[] list = new Object[________entity.length];
      for (int i = 0; i < ________entity.length; i++)
      {
        list[i] = null;
        list[i] = EntityObjectHelper.getMap (________entity[i], (Map) list[i]);

        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      record.put ("EntityList", list);
    }
      if (invs_type != null) InvsTypeObjectHelper.toMap (invs_type, record, "InvsType");

      if (_______check_type != null) record.put ("CheckType", _______check_type);
      connection = openConnection ();
interaction = connection.createInteraction ();
record = (MappedRecord) interaction.execute (spec, record);
}
catch (BSDMResourceException be)
{
cex = be;
throw be;
}
catch (ResourceException ex)
{
cex = new BSDMResourceException (BSDMResourceException.FRONT_END, ex);
throw cex;
}
finally
{
try
{
if (interaction != null) interaction.close ();
if (connection != null) closeConnection (connection);
}
catch (BSDMResourceException be)
{
if (cex != null) be.initCause (cex);
throw be;
}
catch (ResourceException re)
{
BSDMResourceException bre = new BSDMResourceException (BSDMResourceException.FRONT_END, re);
if (cex != null) bre.initCause (cex);
throw bre;
}
}
return InvsTypeObjectHelper.fromMapList (record, "InvsTypeList");
}

  /**

   * Finds eligible ContractTypes.

   * Convenience method using default BSDMSessionContext.

   * @param entity Input List Object.

   * @param contract_type Input Filter Object.

   * @param effective_date (has a default).

   * @param _check_type (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ContractTypeObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ContractTypeObjectDataList contractTypeFindEligible (EntityObjectData[] entity, ContractTypeObjectFilter contract_type, Date effective_date, Integer _check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return contractTypeFindEligible (null, entity, contract_type, effective_date, _check_type, defaultAction, constraintAction);
  }
  /** 
   * Finds eligible ContractTypes.
   * @param context The session context to use when connecting to the APITS server.
   * @param entity Input List Object.
   * @param contract_type Input Filter Object.
   * @param effective_date (has a default).
   * @param _check_type (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ContractTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ContractTypeObjectDataList contractTypeFindEligible (BSDMSessionContext context, EntityObjectData[] entity, ContractTypeObjectFilter contract_type, Date effective_date, Integer _check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

     //Defaulting not supported on Arrays
       
     dManager.setObjectDefaults(contract_type, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

     //Constraints not supported on Arrays
       
     cManager.checkConstraints(contract_type, constraintAction);
       
    //Constraints not supported on Input-Column
return contractTypeFindEligible (context, entity, contract_type, effective_date, _check_type);
  }

  /**

   * Finds eligible NrcTransDescrs.

   * Convenience method using default BSDMSessionContext.

   * @param _entity Input List Object.

   * @param nrc_trans_descr Input Filter Object.

   * @param _effective_date (has a default).

   * @param __check_type (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return NrcTransDescrObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public NrcTransDescrObjectDataList nrcTransDescrFindEligible (EntityObjectData[] _entity, NrcTransDescrObjectFilter nrc_trans_descr, Date _effective_date, Integer __check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return nrcTransDescrFindEligible (null, _entity, nrc_trans_descr, _effective_date, __check_type, defaultAction, constraintAction);
  }
  /** 
   * Finds eligible NrcTransDescrs.
   * @param context The session context to use when connecting to the APITS server.
   * @param _entity Input List Object.
   * @param nrc_trans_descr Input Filter Object.
   * @param _effective_date (has a default).
   * @param __check_type (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return NrcTransDescrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public NrcTransDescrObjectDataList nrcTransDescrFindEligible (BSDMSessionContext context, EntityObjectData[] _entity, NrcTransDescrObjectFilter nrc_trans_descr, Date _effective_date, Integer __check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

     //Defaulting not supported on Arrays
       
     dManager.setObjectDefaults(nrc_trans_descr, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

     //Constraints not supported on Arrays
       
     cManager.checkConstraints(nrc_trans_descr, constraintAction);
       
    //Constraints not supported on Input-Column
return nrcTransDescrFindEligible (context, _entity, nrc_trans_descr, _effective_date, __check_type);
  }

  /**

   * Finds eligible ProductElements.

   * Convenience method using default BSDMSessionContext.

   * @param __entity Input List Object.

   * @param product_element Input Filter Object.

   * @param address_id (null is allowed).

   * @param industry_type (null is allowed).

   * @param __effective_date (has a default).

   * @param ___check_type (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ProductElementObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ProductElementObjectDataList productElementFindEligible (EntityObjectData[] __entity, ProductElementObjectFilter product_element, Integer address_id, Integer[] industry_type, Date __effective_date, Integer ___check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return productElementFindEligible (null, __entity, product_element, address_id, industry_type, __effective_date, ___check_type, defaultAction, constraintAction);
  }
  /** 
   * Finds eligible ProductElements.
   * @param context The session context to use when connecting to the APITS server.
   * @param __entity Input List Object.
   * @param product_element Input Filter Object.
   * @param address_id (null is allowed).
   * @param industry_type (null is allowed).
   * @param __effective_date (has a default).
   * @param ___check_type (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ProductElementObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ProductElementObjectDataList productElementFindEligible (BSDMSessionContext context, EntityObjectData[] __entity, ProductElementObjectFilter product_element, Integer address_id, Integer[] industry_type, Date __effective_date, Integer ___check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     //Defaulting not supported on Arrays
       
     dManager.setObjectDefaults(product_element, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

     //Constraints not supported on Arrays
       
     cManager.checkConstraints(product_element, constraintAction);
       
    //Constraints not supported on Input-Column
return productElementFindEligible (context, __entity, product_element, address_id, industry_type, __effective_date, ___check_type);
  }

  /**

   * Finds eligible PackageDefinitions.

   * Convenience method using default BSDMSessionContext.

   * @param ___entity Input List Object.

   * @param package_definition Input Filter Object.

   * @param ___address_id (null is allowed).

   * @param ___industry_type (null is allowed).

   * @param ___effective_date (has a default).

   * @param level (has a default).

   * @param ____check_type (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PDObjectDataList packageDefinitionFindEligible (EntityObjectData[] ___entity, PDObjectFilter package_definition, Integer ___address_id, Integer[] ___industry_type, Date ___effective_date, Integer level, Integer ____check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return packageDefinitionFindEligible (null, ___entity, package_definition, ___address_id, ___industry_type, ___effective_date, level, ____check_type, defaultAction, constraintAction);
  }
  /** 
   * Finds eligible PackageDefinitions.
   * @param context The session context to use when connecting to the APITS server.
   * @param ___entity Input List Object.
   * @param package_definition Input Filter Object.
   * @param ___address_id (null is allowed).
   * @param ___industry_type (null is allowed).
   * @param ___effective_date (has a default).
   * @param level (has a default).
   * @param ____check_type (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PDObjectDataList packageDefinitionFindEligible (BSDMSessionContext context, EntityObjectData[] ___entity, PDObjectFilter package_definition, Integer ___address_id, Integer[] ___industry_type, Date ___effective_date, Integer level, Integer ____check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     //Defaulting not supported on Arrays
       
     dManager.setObjectDefaults(package_definition, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

     //Constraints not supported on Arrays
       
     cManager.checkConstraints(package_definition, constraintAction);
       
    //Constraints not supported on Input-Column
return packageDefinitionFindEligible (context, ___entity, package_definition, ___address_id, ___industry_type, ___effective_date, level, ____check_type);
  }

  /**

   * Finds eligible ExternalIdTypes.

   * Convenience method using default BSDMSessionContext.

   * @param ____entity Input List Object.

   * @param external_id_type Input Filter Object.

   * @param ____effective_date (has a default).

   * @param _____check_type (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ExternalIdTypeObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ExternalIdTypeObjectDataList externalIdTypeFindEligible (EntityObjectData[] ____entity, ExternalIdTypeObjectFilter external_id_type, Date ____effective_date, Integer _____check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return externalIdTypeFindEligible (null, ____entity, external_id_type, ____effective_date, _____check_type, defaultAction, constraintAction);
  }
  /** 
   * Finds eligible ExternalIdTypes.
   * @param context The session context to use when connecting to the APITS server.
   * @param ____entity Input List Object.
   * @param external_id_type Input Filter Object.
   * @param ____effective_date (has a default).
   * @param _____check_type (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ExternalIdTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ExternalIdTypeObjectDataList externalIdTypeFindEligible (BSDMSessionContext context, EntityObjectData[] ____entity, ExternalIdTypeObjectFilter external_id_type, Date ____effective_date, Integer _____check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

     //Defaulting not supported on Arrays
       
     dManager.setObjectDefaults(external_id_type, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

     //Constraints not supported on Arrays
       
     cManager.checkConstraints(external_id_type, constraintAction);
       
    //Constraints not supported on Input-Column
return externalIdTypeFindEligible (context, ____entity, external_id_type, ____effective_date, _____check_type);
  }

  /**

   * Finds eligible ServicePricingPlans.

   * Convenience method using default BSDMSessionContext.

   * @param _____entity Input List Object.

   * @param service_pricing_plan Input Filter Object.

   * @param _____effective_date (has a default).

   * @param _address_id (null is allowed).

   * @param __industry_type (null is allowed).

   * @param check_type (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return ServicePricingPlanObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public ServicePricingPlanObjectDataList servicePricingPlanFindEligible (EntityObjectData[] _____entity, ServicePricingPlanObjectFilter service_pricing_plan, Date _____effective_date, Integer _address_id, Integer[] __industry_type, Integer check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return servicePricingPlanFindEligible (null, _____entity, service_pricing_plan, _____effective_date, _address_id, __industry_type, check_type, defaultAction, constraintAction);
  }
  /** 
   * Finds eligible ServicePricingPlans.
   * @param context The session context to use when connecting to the APITS server.
   * @param _____entity Input List Object.
   * @param service_pricing_plan Input Filter Object.
   * @param _____effective_date (has a default).
   * @param _address_id (null is allowed).
   * @param __industry_type (null is allowed).
   * @param check_type (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public ServicePricingPlanObjectDataList servicePricingPlanFindEligible (BSDMSessionContext context, EntityObjectData[] _____entity, ServicePricingPlanObjectFilter service_pricing_plan, Date _____effective_date, Integer _address_id, Integer[] __industry_type, Integer check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

     //Defaulting not supported on Arrays
       
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     dManager.setObjectDefaults(service_pricing_plan, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

     //Constraints not supported on Arrays
       
    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

     cManager.checkConstraints(service_pricing_plan, constraintAction);
       
    //Constraints not supported on Input-Column
return servicePricingPlanFindEligible (context, _____entity, service_pricing_plan, _____effective_date, _address_id, __industry_type, check_type);
  }

  /**

   * Finds eligible PackageComponentDefs.

   * Convenience method using default BSDMSessionContext.

   * @param ______entity Input List Object.

   * @param package_component_def Input Filter Object.

   * @param ______address_id (null is allowed).

   * @param ______industry_type (null is allowed).

   * @param ______effective_date (has a default).

   * @param ______check_type (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return PCDObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public PCDObjectDataList packageComponentDefFindEligible (EntityObjectData[] ______entity, PCDObjectFilter package_component_def, Integer ______address_id, Integer[] ______industry_type, Date ______effective_date, Integer ______check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return packageComponentDefFindEligible (null, ______entity, package_component_def, ______address_id, ______industry_type, ______effective_date, ______check_type, defaultAction, constraintAction);
  }
  /** 
   * Finds eligible PackageComponentDefs.
   * @param context The session context to use when connecting to the APITS server.
   * @param ______entity Input List Object.
   * @param package_component_def Input Filter Object.
   * @param ______address_id (null is allowed).
   * @param ______industry_type (null is allowed).
   * @param ______effective_date (has a default).
   * @param ______check_type (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public PCDObjectDataList packageComponentDefFindEligible (BSDMSessionContext context, EntityObjectData[] ______entity, PCDObjectFilter package_component_def, Integer ______address_id, Integer[] ______industry_type, Date ______effective_date, Integer ______check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     //Defaulting not supported on Arrays
       
     dManager.setObjectDefaults(package_component_def, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

     //Constraints not supported on Arrays
       
     cManager.checkConstraints(package_component_def, constraintAction);
       
    //Constraints not supported on Input-Column
return packageComponentDefFindEligible (context, ______entity, package_component_def, ______address_id, ______industry_type, ______effective_date, ______check_type);
  }

  /**

   * Finds eligible PackageComponentDefs.

   * Convenience method using default BSDMSessionContext.

   * @param ________entity Input List Object.

   * @param invs_type Input Filter Object.

   * @param ________address_id (null is allowed).

   * @param ________effective_date (has a default).

   * @param _______check_type (null is allowed) (has a default).

   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints

   * @return InvsTypeObjectDataList as output

   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint failed
   * @ejb:interface-method view-type="remote"
   */

  public InvsTypeObjectDataList invsTypeFindEligible (EntityObjectData[] ________entity, InvsTypeObjectFilter invs_type, Integer ________address_id, Date ________effective_date, Integer _______check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    return invsTypeFindEligible (null, ________entity, invs_type, ________address_id, ________effective_date, _______check_type, defaultAction, constraintAction);
  }
  /** 
   * Finds eligible PackageComponentDefs.
   * @param context The session context to use when connecting to the APITS server.
   * @param ________entity Input List Object.
   * @param invs_type Input Filter Object.
   * @param ________address_id (null is allowed).
   * @param ________effective_date (has a default).
   * @param _______check_type (null is allowed) (has a default).
   * @param defaultAction Action key for setting defaults
   * @param constraintAction Action key for setting constraints
   * @return InvsTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException Whenever a constraint fails
   * @ejb:interface-method view-type="remote"
   */
   
  public InvsTypeObjectDataList invsTypeFindEligible (BSDMSessionContext context, EntityObjectData[] ________entity, InvsTypeObjectFilter invs_type, Integer ________address_id, Date ________effective_date, Integer _______check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException
  {
    DefaultManager dManager = DefaultManager.getInstance();
    ConstraintManager cManager = ConstraintManager.getInstance();
    
    //Defaulting not supported on Input-Column

    //Defaulting not supported on Input-Column

     //Defaulting not supported on Arrays
       
     dManager.setObjectDefaults(invs_type, defaultAction);
       
    //Defaulting not supported on Input-Column

    //Constraints not supported on Input-Column

    //Constraints not supported on Input-Column

     //Constraints not supported on Arrays
       
     cManager.checkConstraints(invs_type, constraintAction);
       
    //Constraints not supported on Input-Column
return invsTypeFindEligible (context, ________entity, invs_type, ________address_id, ________effective_date, _______check_type);
  }

  /** Constructor to create a Session Bean to be used in an EJB AppServer.
   */
  public ProductCatalogBean ()
  {
    try
    {
      _ContractTypeFindEligibleSpec = new BSDMInteractionSpec("ContractTypeFindEligible", ApiMappings.getCallName ("ContractTypeFindEligible"), Boolean.TRUE);

      _NrcTransDescrFindEligibleSpec = new BSDMInteractionSpec("NrcTransDescrFindEligible", ApiMappings.getCallName ("NrcTransDescrFindEligible"), Boolean.TRUE);

      _ProductElementFindEligibleSpec = new BSDMInteractionSpec("ProductElementFindEligible", ApiMappings.getCallName ("ProductElementFindEligible"), Boolean.TRUE);

      _PackageDefinitionFindEligibleSpec = new BSDMInteractionSpec("PackageDefinitionFindEligible", ApiMappings.getCallName ("PackageDefinitionFindEligible"), Boolean.TRUE);

      _ExternalIdTypeFindEligibleSpec = new BSDMInteractionSpec("ExternalIdTypeFindEligible", ApiMappings.getCallName ("ExternalIdTypeFindEligible"), Boolean.TRUE);

      _ServicePricingPlanFindEligibleSpec = new BSDMInteractionSpec("ServicePricingPlanFindEligible", ApiMappings.getCallName ("ServicePricingPlanFindEligible"), Boolean.TRUE);

      _PackageComponentDefFindEligibleSpec = new BSDMInteractionSpec("PackageComponentDefFindEligible", ApiMappings.getCallName ("PackageComponentDefFindEligible"), Boolean.TRUE);

      _InvsTypeFindEligibleSpec = new BSDMInteractionSpec("InvsTypeFindEligible", ApiMappings.getCallName ("InvsTypeFindEligible"), Boolean.TRUE);

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  @Inject public ProductCatalogBean(BSDMSettings settings)
  {
    this (settings, BSDMConnectionManager.getInstance (settings));
  }
  /** Constructor to create a Session Bean to be used in a stand-alone JavaBean environment.
   * @param settings  BSDM connection settings to use when connecting to the TS/API middleware servers.
   */
  public ProductCatalogBean(BSDMSettings settings, BSDMConnectionManager cm)
  {
    this();
    this.settings = settings;
    cf = cm.getConnectionFactory ();
  }
  /** Method used by EJB App Servers. */
  public void setSessionContext(SessionContext sc)
  {
    this.sc = sc;
    Properties props = new Properties();
    String lookupName = "java:comp/env/BSDMEIS";
    try
    {
      props.load(this.getClass().getResourceAsStream("/bsdJndi.properties"));
      String url = props.getProperty("jndi.url");
      String principal = props.getProperty("jndi.principal");
      String credentials = props.getProperty("jndi.credentials");
      String factory = props.getProperty("jndi.factory");
      if (url != null) props.put(Context.PROVIDER_URL, url);
      if (principal != null) props.put(Context.SECURITY_PRINCIPAL, principal);
      if (credentials != null) props.put(Context.SECURITY_CREDENTIALS, credentials);
      if (factory != null) props.put(Context.INITIAL_CONTEXT_FACTORY, factory);
      lookupName = props.getProperty("ConnectorJndiName", "java:comp/env/BSDMEIS");
    }
    catch (Exception x)
    {
      x.printStackTrace();
      props = new Properties();
      lookupName = "java:comp/env/BSDMEIS";
    }
    try
    {
      Context ic = new InitialContext(props);
      cf = (ConnectionFactory) ic.lookup(lookupName);
      settings = BSDMSettings.getDefault ();
    }
    catch (NamingException ex)
    {
      ex.printStackTrace();
    }
  }
  private Connection openConnection() throws ResourceException
  {
    return cf.getConnection();
  }
  private void closeConnection(Connection connection) throws ResourceException
  {
    connection.close();
  }
}
