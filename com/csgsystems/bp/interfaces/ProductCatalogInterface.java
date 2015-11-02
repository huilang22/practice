
package com.csgsystems.bp.interfaces;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.ejb.Remote;

import com.csgsystems.bali.BaliInterface;

import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.constraint.ConstraintException;


import com.csgsystems.bp.data.*;
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
 */
@Remote
public interface ProductCatalogInterface extends BaliInterface {

  /**
   * Finds eligible ContractTypes.
   * Convenience method using default BSDMSessionContext.
   * @param entity Input List Object.
   * @param contract_type Input Filter Object.
   * @param effective_date (has a default).
   * @param _check_type (null is allowed) (has a default).
   * @return ContractTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ContractTypeObjectDataList contractTypeFindEligible (EntityObjectData[] entity, ContractTypeObjectFilter contract_type, Date effective_date, Integer _check_type) throws BSDMResourceException;
  /**
   * Finds eligible ContractTypes.
   * @param context The session context to use when connecting to the APITS server.
   * @param entity Input List Object.
   * @param contract_type Input Filter Object.
   * @param effective_date (has a default).
   * @param _check_type (null is allowed) (has a default).
   * @return ContractTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ContractTypeObjectDataList contractTypeFindEligible (BSDMSessionContext context, EntityObjectData[] entity, ContractTypeObjectFilter contract_type, Date effective_date, Integer _check_type) throws BSDMResourceException;


  /**
   * Finds eligible ContractTypes.
   * Convenience method using default BSDMSessionContext.
   * @param entity Input List Object.
   * @param contract_type Input Filter Object.
   * @param effective_date (has a default).
   * @param _check_type (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ContractTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ContractTypeObjectDataList contractTypeFindEligible (EntityObjectData[] entity, ContractTypeObjectFilter contract_type, Date effective_date, Integer _check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds eligible ContractTypes.
   * @param context The session context to use when connecting to the APITS server.
   * @param entity Input List Object.
   * @param contract_type Input Filter Object.
   * @param effective_date (has a default).
   * @param _check_type (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ContractTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ContractTypeObjectDataList contractTypeFindEligible (BSDMSessionContext context, EntityObjectData[] entity, ContractTypeObjectFilter contract_type, Date effective_date, Integer _check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds eligible NrcTransDescrs.
   * Convenience method using default BSDMSessionContext.
   * @param _entity Input List Object.
   * @param nrc_trans_descr Input Filter Object.
   * @param _effective_date (has a default).
   * @param __check_type (null is allowed) (has a default).
   * @return NrcTransDescrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NrcTransDescrObjectDataList nrcTransDescrFindEligible (EntityObjectData[] _entity, NrcTransDescrObjectFilter nrc_trans_descr, Date _effective_date, Integer __check_type) throws BSDMResourceException;
  /**
   * Finds eligible NrcTransDescrs.
   * @param context The session context to use when connecting to the APITS server.
   * @param _entity Input List Object.
   * @param nrc_trans_descr Input Filter Object.
   * @param _effective_date (has a default).
   * @param __check_type (null is allowed) (has a default).
   * @return NrcTransDescrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public NrcTransDescrObjectDataList nrcTransDescrFindEligible (BSDMSessionContext context, EntityObjectData[] _entity, NrcTransDescrObjectFilter nrc_trans_descr, Date _effective_date, Integer __check_type) throws BSDMResourceException;


  /**
   * Finds eligible NrcTransDescrs.
   * Convenience method using default BSDMSessionContext.
   * @param _entity Input List Object.
   * @param nrc_trans_descr Input Filter Object.
   * @param _effective_date (has a default).
   * @param __check_type (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NrcTransDescrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public NrcTransDescrObjectDataList nrcTransDescrFindEligible (EntityObjectData[] _entity, NrcTransDescrObjectFilter nrc_trans_descr, Date _effective_date, Integer __check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds eligible NrcTransDescrs.
   * @param context The session context to use when connecting to the APITS server.
   * @param _entity Input List Object.
   * @param nrc_trans_descr Input Filter Object.
   * @param _effective_date (has a default).
   * @param __check_type (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return NrcTransDescrObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public NrcTransDescrObjectDataList nrcTransDescrFindEligible (BSDMSessionContext context, EntityObjectData[] _entity, NrcTransDescrObjectFilter nrc_trans_descr, Date _effective_date, Integer __check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

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
   */
  public ProductElementObjectDataList productElementFindEligible (EntityObjectData[] __entity, ProductElementObjectFilter product_element, Integer address_id, Integer[] industry_type, Date __effective_date, Integer ___check_type) throws BSDMResourceException;
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
   */
  public ProductElementObjectDataList productElementFindEligible (BSDMSessionContext context, EntityObjectData[] __entity, ProductElementObjectFilter product_element, Integer address_id, Integer[] industry_type, Date __effective_date, Integer ___check_type) throws BSDMResourceException;


  /**
   * Finds eligible ProductElements.
   * Convenience method using default BSDMSessionContext.
   * @param __entity Input List Object.
   * @param product_element Input Filter Object.
   * @param address_id (null is allowed).
   * @param industry_type (null is allowed).
   * @param __effective_date (has a default).
   * @param ___check_type (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductElementObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductElementObjectDataList productElementFindEligible (EntityObjectData[] __entity, ProductElementObjectFilter product_element, Integer address_id, Integer[] industry_type, Date __effective_date, Integer ___check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds eligible ProductElements.
   * @param context The session context to use when connecting to the APITS server.
   * @param __entity Input List Object.
   * @param product_element Input Filter Object.
   * @param address_id (null is allowed).
   * @param industry_type (null is allowed).
   * @param __effective_date (has a default).
   * @param ___check_type (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductElementObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductElementObjectDataList productElementFindEligible (BSDMSessionContext context, EntityObjectData[] __entity, ProductElementObjectFilter product_element, Integer address_id, Integer[] industry_type, Date __effective_date, Integer ___check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

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
   */
  public PDObjectDataList packageDefinitionFindEligible (EntityObjectData[] ___entity, PDObjectFilter package_definition, Integer ___address_id, Integer[] ___industry_type, Date ___effective_date, Integer level, Integer ____check_type) throws BSDMResourceException;
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
   */
  public PDObjectDataList packageDefinitionFindEligible (BSDMSessionContext context, EntityObjectData[] ___entity, PDObjectFilter package_definition, Integer ___address_id, Integer[] ___industry_type, Date ___effective_date, Integer level, Integer ____check_type) throws BSDMResourceException;


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

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PDObjectDataList packageDefinitionFindEligible (EntityObjectData[] ___entity, PDObjectFilter package_definition, Integer ___address_id, Integer[] ___industry_type, Date ___effective_date, Integer level, Integer ____check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
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

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PDObjectDataList packageDefinitionFindEligible (BSDMSessionContext context, EntityObjectData[] ___entity, PDObjectFilter package_definition, Integer ___address_id, Integer[] ___industry_type, Date ___effective_date, Integer level, Integer ____check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Finds eligible ExternalIdTypes.
   * Convenience method using default BSDMSessionContext.
   * @param ____entity Input List Object.
   * @param external_id_type Input Filter Object.
   * @param ____effective_date (has a default).
   * @param _____check_type (null is allowed) (has a default).
   * @return ExternalIdTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExternalIdTypeObjectDataList externalIdTypeFindEligible (EntityObjectData[] ____entity, ExternalIdTypeObjectFilter external_id_type, Date ____effective_date, Integer _____check_type) throws BSDMResourceException;
  /**
   * Finds eligible ExternalIdTypes.
   * @param context The session context to use when connecting to the APITS server.
   * @param ____entity Input List Object.
   * @param external_id_type Input Filter Object.
   * @param ____effective_date (has a default).
   * @param _____check_type (null is allowed) (has a default).
   * @return ExternalIdTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ExternalIdTypeObjectDataList externalIdTypeFindEligible (BSDMSessionContext context, EntityObjectData[] ____entity, ExternalIdTypeObjectFilter external_id_type, Date ____effective_date, Integer _____check_type) throws BSDMResourceException;


  /**
   * Finds eligible ExternalIdTypes.
   * Convenience method using default BSDMSessionContext.
   * @param ____entity Input List Object.
   * @param external_id_type Input Filter Object.
   * @param ____effective_date (has a default).
   * @param _____check_type (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExternalIdTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ExternalIdTypeObjectDataList externalIdTypeFindEligible (EntityObjectData[] ____entity, ExternalIdTypeObjectFilter external_id_type, Date ____effective_date, Integer _____check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds eligible ExternalIdTypes.
   * @param context The session context to use when connecting to the APITS server.
   * @param ____entity Input List Object.
   * @param external_id_type Input Filter Object.
   * @param ____effective_date (has a default).
   * @param _____check_type (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ExternalIdTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ExternalIdTypeObjectDataList externalIdTypeFindEligible (BSDMSessionContext context, EntityObjectData[] ____entity, ExternalIdTypeObjectFilter external_id_type, Date ____effective_date, Integer _____check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

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
   */
  public ServicePricingPlanObjectDataList servicePricingPlanFindEligible (EntityObjectData[] _____entity, ServicePricingPlanObjectFilter service_pricing_plan, Date _____effective_date, Integer _address_id, Integer[] __industry_type, Integer check_type) throws BSDMResourceException;
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
   */
  public ServicePricingPlanObjectDataList servicePricingPlanFindEligible (BSDMSessionContext context, EntityObjectData[] _____entity, ServicePricingPlanObjectFilter service_pricing_plan, Date _____effective_date, Integer _address_id, Integer[] __industry_type, Integer check_type) throws BSDMResourceException;


  /**
   * Finds eligible ServicePricingPlans.
   * Convenience method using default BSDMSessionContext.
   * @param _____entity Input List Object.
   * @param service_pricing_plan Input Filter Object.
   * @param _____effective_date (has a default).
   * @param _address_id (null is allowed).
   * @param __industry_type (null is allowed).
   * @param check_type (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServicePricingPlanObjectDataList servicePricingPlanFindEligible (EntityObjectData[] _____entity, ServicePricingPlanObjectFilter service_pricing_plan, Date _____effective_date, Integer _address_id, Integer[] __industry_type, Integer check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds eligible ServicePricingPlans.
   * @param context The session context to use when connecting to the APITS server.
   * @param _____entity Input List Object.
   * @param service_pricing_plan Input Filter Object.
   * @param _____effective_date (has a default).
   * @param _address_id (null is allowed).
   * @param __industry_type (null is allowed).
   * @param check_type (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServicePricingPlanObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServicePricingPlanObjectDataList servicePricingPlanFindEligible (BSDMSessionContext context, EntityObjectData[] _____entity, ServicePricingPlanObjectFilter service_pricing_plan, Date _____effective_date, Integer _address_id, Integer[] __industry_type, Integer check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

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
   */
  public PCDObjectDataList packageComponentDefFindEligible (EntityObjectData[] ______entity, PCDObjectFilter package_component_def, Integer ______address_id, Integer[] ______industry_type, Date ______effective_date, Integer ______check_type) throws BSDMResourceException;
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
   */
  public PCDObjectDataList packageComponentDefFindEligible (BSDMSessionContext context, EntityObjectData[] ______entity, PCDObjectFilter package_component_def, Integer ______address_id, Integer[] ______industry_type, Date ______effective_date, Integer ______check_type) throws BSDMResourceException;


  /**
   * Finds eligible PackageComponentDefs.
   * Convenience method using default BSDMSessionContext.
   * @param ______entity Input List Object.
   * @param package_component_def Input Filter Object.
   * @param ______address_id (null is allowed).
   * @param ______industry_type (null is allowed).
   * @param ______effective_date (has a default).
   * @param ______check_type (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public PCDObjectDataList packageComponentDefFindEligible (EntityObjectData[] ______entity, PCDObjectFilter package_component_def, Integer ______address_id, Integer[] ______industry_type, Date ______effective_date, Integer ______check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds eligible PackageComponentDefs.
   * @param context The session context to use when connecting to the APITS server.
   * @param ______entity Input List Object.
   * @param package_component_def Input Filter Object.
   * @param ______address_id (null is allowed).
   * @param ______industry_type (null is allowed).
   * @param ______effective_date (has a default).
   * @param ______check_type (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return PCDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public PCDObjectDataList packageComponentDefFindEligible (BSDMSessionContext context, EntityObjectData[] ______entity, PCDObjectFilter package_component_def, Integer ______address_id, Integer[] ______industry_type, Date ______effective_date, Integer ______check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

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
   */
  public InvsTypeObjectDataList invsTypeFindEligible (EntityObjectData[] ________entity, InvsTypeObjectFilter invs_type, Integer ________address_id, Date ________effective_date, Integer _______check_type) throws BSDMResourceException;
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
   */
  public InvsTypeObjectDataList invsTypeFindEligible (BSDMSessionContext context, EntityObjectData[] ________entity, InvsTypeObjectFilter invs_type, Integer ________address_id, Date ________effective_date, Integer _______check_type) throws BSDMResourceException;


  /**
   * Finds eligible PackageComponentDefs.
   * Convenience method using default BSDMSessionContext.
   * @param ________entity Input List Object.
   * @param invs_type Input Filter Object.
   * @param ________address_id (null is allowed).
   * @param ________effective_date (has a default).
   * @param _______check_type (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvsTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public InvsTypeObjectDataList invsTypeFindEligible (EntityObjectData[] ________entity, InvsTypeObjectFilter invs_type, Integer ________address_id, Date ________effective_date, Integer _______check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Finds eligible PackageComponentDefs.
   * @param context The session context to use when connecting to the APITS server.
   * @param ________entity Input List Object.
   * @param invs_type Input Filter Object.
   * @param ________address_id (null is allowed).
   * @param ________effective_date (has a default).
   * @param _______check_type (null is allowed) (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return InvsTypeObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public InvsTypeObjectDataList invsTypeFindEligible (BSDMSessionContext context, EntityObjectData[] ________entity, InvsTypeObjectFilter invs_type, Integer ________address_id, Date ________effective_date, Integer _______check_type, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
